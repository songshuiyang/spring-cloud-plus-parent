package com.songsy.springcloud.plus.user.web;

import com.songsy.springcloud.plus.common.base.BaseController;
import com.songsy.springcloud.plus.common.mo.ResponseMO;
import com.songsy.springcloud.plus.entity.user.UserDO;
import com.songsy.springcloud.plus.user.client.GoodsClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songsy
 * @date 2019/8/14 18:40
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private GoodsClient goodsClient;

    @GetMapping("/getById/{id}")
    public ResponseMO getById(@PathVariable("id") String id) {
        UserDO userDO = new UserDO();
        userDO.setAccount("admin");
        userDO.setMobile("10086");
        return success(userDO);
    }

    @GetMapping("/getGoodsDetail/{id}")
    public ResponseMO getGoodsDetail(@PathVariable("id") String id) {
        if (StringUtils.isBlank(id)) {
            id = "5b5ed0900afc450b0f4236d5";
        }
        return goodsClient.getGoodsDetail(id);
    }

}
