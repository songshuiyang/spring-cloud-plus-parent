package com.songsy.springcloud.plus.sso;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 指定端口启动
 *
 * @author songsy
 * @date 2019/8/14 17:43
 */
@SpringCloudApplication
public class SsoApplication2 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SsoApplication2.class).properties("server.port=2022").run(args);
    }

}
