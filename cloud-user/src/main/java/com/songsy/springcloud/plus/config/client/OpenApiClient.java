package com.songsy.springcloud.plus.config.client;

import com.songsy.springcloud.plus.common.mo.ResponseMO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 测试 url 参数
 *
 * @author songsy
 * @date 2019/9/3 10:51
 */
@FeignClient(value = "openApiClient", url = "https://www.apiopen.top")
public interface OpenApiClient {

    @RequestMapping(value = "/journalismApi", method = RequestMethod.GET)
    ResponseMO journalismApi();

}
