package com.songsy.springcloud.plus.user.web;

import com.songsy.springcloud.plus.common.mo.ResponseMO;
import com.songsy.springcloud.plus.user.client.OpenApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songsy
 * @date 2019/11/4 10:54
 */
@RestController
@RequestMapping("/openApi")
public class OpenApiController {

    @Autowired
    private OpenApiClient openApiClient;

    @GetMapping("/journalismApi")
    public ResponseMO getGoodsDetail() {
        return openApiClient.journalismApi();
    }

}
