package com.songsy.springcloud.plus.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试自动配置类
 *
 * @author songsy
 * @date 2019/8/15 18:09
 */
@Configuration
@ConditionalOnBean(CloudMarkerConfiguration.Marker.class)
public class CloudAutoConfiguration {

    @RestController
    @RequestMapping("/system")
    class SystemController {

        @GetMapping("/info")
        public Map<String, Object> getInfo() {
            Map<String, Object> objectMap = new HashMap<String, Object>(8);
            objectMap.put("appName","spring-cloud-plus-parent");
            objectMap.put("groupId","com.songsy.springcloud.plus");
            objectMap.put("artifactId","cloud-parent");
            objectMap.put("version","1.0-SNAPSHOT");
            objectMap.put("currentTimeMillis",System.currentTimeMillis());
            return objectMap;
        }

    }
}
