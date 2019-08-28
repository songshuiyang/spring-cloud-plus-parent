package com.songsy.springcloud.plus.common.base;

import com.songsy.springcloud.plus.common.mo.ResponseMO;
import com.songsy.springcloud.plus.common.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author songsy
 * @date 2019/8/14 18:57
 */
@Slf4j
public abstract class BaseController {

    protected ResponseMO success() {
        return ResponseUtil.success();
    }

    protected ResponseMO success(String msg) {
        return ResponseUtil.success(msg);
    }

    protected ResponseMO success(Object obj) {
        return ResponseUtil.successWithData(obj);
    }

    protected ResponseMO success(Object obj, String msg) {
        return ResponseUtil.successWithData(msg, obj);
    }

    protected ResponseMO error(String msg) {
        return ResponseUtil.error(msg);
    }

    /**
     * 获取当前用户id
     *
     * @return
     */
    protected String currentUserId() {
        String userId = null;
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                    .getRequest();
            if (request != null) {
                userId = request.getHeader("userId");
            }
        } catch (IllegalStateException e) {
            log.error("currentUserId 错误", e);
        }
        return userId == null ? "" : userId;
    }
    /**
     * 获取当前用户的TOKEN
     * @return
     */
    protected String currentToken() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String token = null;
        if(request != null) {
            token = request.getHeader("X-User-Id");
        }
        return token == null ? "" : token;
    }
}
