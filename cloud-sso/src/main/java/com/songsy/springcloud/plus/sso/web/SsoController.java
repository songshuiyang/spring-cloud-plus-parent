package com.songsy.springcloud.plus.sso.web;

import com.songsy.springcloud.plus.common.base.BaseController;
import com.songsy.springcloud.plus.common.mo.ResponseMO;
import com.songsy.springcloud.plus.common.util.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songsy
 * @date 2019/8/20 18:40
 */
@RestController
@RequestMapping("/sso")
public class SsoController extends BaseController {

    @RequestMapping(value = "/createToken", method = RequestMethod.POST)
    public ResponseMO createToken() {
        return ResponseUtil.success("F34HB23V234HV234J2H34BJK234JK234B23JK4B2K34BJK2B3K4J23JK");
    }

    @RequestMapping(value = "/checkToken", method = RequestMethod.POST)
    public ResponseMO checkToken() {
        return ResponseUtil.success();
    }
}
