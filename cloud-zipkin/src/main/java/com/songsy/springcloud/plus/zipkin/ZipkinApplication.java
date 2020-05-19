package com.songsy.springcloud.plus.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author songsy
 * @date 2019/8/13 18:15
 */
@EnableZipkinServer
@SpringCloudApplication
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
