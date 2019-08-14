package com.songsy.springcloud.plus.zuul.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.songsy.springcloud.plus.common.constant.ApplicationConstants;
import com.songsy.springcloud.plus.common.mo.ResponseMO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

/**
 * 鉴权Filter
 *
 * @author songsy
 * @date 2019/8/14 18:23
 */
@Slf4j
@Component
public class AuthenticationFilter extends ZuulFilter {

    private Pattern p = Pattern.compile("/*/pub/*");

    @Override
    public Object run() {
        ResponseMO resMO = new ResponseMO();
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        String relativeURL = extractRelativePath(request);
        if (p.matcher(relativeURL).find()) {
            return null;
        }
        log.info(">> 鉴权开始[{}]",relativeURL);
        ResponseMO resModel = null;
        if (relativeURL.startsWith(ApplicationConstants.APPLICATION_USER)) {
            // TODO
            resModel = new ResponseMO();
        } else if (relativeURL.startsWith(ApplicationConstants.APPLICATION_ZUUL)) {
            // TODO
            resModel = new ResponseMO();
        } else {
            // 其他服务不对其进行路由
            authorizationFailed(relativeURL, ctx, resMO);
            return null;
        }
        if (resModel.getCode() != ResponseMO.RESPONSE_CODE_SUCCESS) {
            // 鉴权失败不对其进行路由
            authorizationFailed(relativeURL, ctx, resMO);
            return null;
        }
        // 从jwt解析后的userId
        ctx.addZuulRequestHeader("userId", "reUserId");
        log.info("<< 鉴权通过[{}]] ", relativeURL);
        return null;
    }

    /**
     * 返回一个boolean值来判断该过滤器是否要执行，true表示执行，false表示不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * gives the order in which this filter will be executed, relative to other
     * filters
     * @return
     */
    @Override
    public int filterOrder() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 鉴权失败
     * @param relativeURL
     * @param ctx
     * @param resMO
     */
    private void authorizationFailed (String relativeURL, RequestContext ctx, ResponseMO resMO) {
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        resMO.setAnonymous();
        String resBody = convertToString(resMO);
        ctx.setResponseBody(resBody);
        log.info("<< 鉴权失败[{}]",relativeURL);
    }

    private static String convertToString(ResponseMO resMO) {
        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(resMO);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return result;
    }

    /**
     * 获取相对访问路径
     * @param request
     * @return
     */
    private String extractRelativePath(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return requestURI;
    }
}

