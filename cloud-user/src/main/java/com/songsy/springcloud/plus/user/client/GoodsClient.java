package com.songsy.springcloud.plus.user.client;

import com.songsy.springcloud.plus.common.mo.ResponseMO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 测试 url 参数
 *
 * @author songsy
 * @date 2019/9/3 10:51
 */
@FeignClient(value = "cloudGoods", url = "https://uatscbackend.fujfu.com")
public interface GoodsClient {

    @RequestMapping(value = "/shopApp/pub/goods/getGoodsDetail/{id}", method = RequestMethod.GET)
    ResponseMO getGoodsDetail(@PathVariable(value = "id") String id);

}
