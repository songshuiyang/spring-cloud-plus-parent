package com.songsy.springcloud.plus.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试自动配置类
 *
 * @author songsy
 * @date 2019/8/15 18:09
 */
@Configuration
@ConditionalOnBean(CloudMarkerConfiguration.Marker.class)
public class CloudAutoConfiguration {

    @Bean
    public AutoConfiguration1 testAutoConfiguration1 () {
        return new AutoConfiguration1();
    }

    @Bean
    public AutoConfiguration2 testAutoConfiguration2 () {
        return new AutoConfiguration2();
    }

    class AutoConfiguration1 {

        private String beanName = "AutoConfiguration1";

        public String getBeanName() {
            return beanName;
        }

        public void setBeanName(String beanName) {
            this.beanName = beanName;
        }
    }

    class AutoConfiguration2 {

        private String beanName = "AutoConfiguration2";

        public String getBeanName() {
            return beanName;
        }

        public void setBeanName(String beanName) {
            this.beanName = beanName;
        }
    }
}
