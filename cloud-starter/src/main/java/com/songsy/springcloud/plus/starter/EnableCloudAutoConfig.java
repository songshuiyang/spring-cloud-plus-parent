package com.songsy.springcloud.plus.starter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 开启自动配置
 *
 * @author songsy
 * @date 2019/8/15 18:15
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(CloudMarkerConfiguration.class)
public @interface EnableCloudAutoConfig {

}
