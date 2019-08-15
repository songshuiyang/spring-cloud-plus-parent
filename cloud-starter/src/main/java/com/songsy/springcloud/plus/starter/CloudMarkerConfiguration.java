package com.songsy.springcloud.plus.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册Marker标记bean，使{@link CloudAutoConfiguration}配置类生效
 *
 * @author songsy
 * @date 2019/8/15 18:09
 */
@Configuration
public class CloudMarkerConfiguration {

    @Bean
    public Marker zuulProxyMarkerBean() {
        return new Marker();
    }

    class Marker {
    }

}
