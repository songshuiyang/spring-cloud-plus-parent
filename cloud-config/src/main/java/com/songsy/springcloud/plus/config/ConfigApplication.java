package com.songsy.springcloud.plus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * TODO 启动会报错 You need to configure a uri for the git repository
 *
 * @author songsy
 * @date 2020/04/14 17:43
 */
@EnableConfigServer
@SpringCloudApplication
public class ConfigApplication {
//    /**
//     * 配置中心读取 服务器地址
//     */
//    @Value("${name_server}")
//    private String nameServer;
//
//    /**
//     * 配置中心读取 主题
//     */
//    @Value("${order_topic}")
//    private String orderTopic;


    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
//
//    @RequestMapping("/config")
//    public String getConfig() {
//        return "name_server = " + nameServer + "; order_topic = " + orderTopic;
//    }


}
