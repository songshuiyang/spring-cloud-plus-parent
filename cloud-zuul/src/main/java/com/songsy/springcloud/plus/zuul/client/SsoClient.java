package com.songsy.springcloud.plus.zuul.client;

import com.songsy.springcloud.plus.common.mo.ResponseMO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author songsy
 * @date 2019/8/20 18:14
 */
@FeignClient(value = "cloudSso")
public interface SsoClient {

    @RequestMapping(value = "/createToken", method = RequestMethod.POST)
    ResponseMO createToken();

    @RequestMapping(value = "/checkToken", method = RequestMethod.POST)
    ResponseMO checkToken();

}
