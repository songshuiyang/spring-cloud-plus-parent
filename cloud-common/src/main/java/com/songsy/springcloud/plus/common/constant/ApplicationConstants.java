package com.songsy.springcloud.plus.common.constant;

import java.util.Arrays;
import java.util.List;

/**
 * @author songsy
 * @date 2019/8/14 18:29
 */
public interface ApplicationConstants {

    String APPLICATION_USER = "/cloudUser";

    String APPLICATION_ZUUL = "/cloudZuul";

    String APPLICATION_SSO = "/cloudSso";

    List<String> APPLICATION_LIST = Arrays.asList(APPLICATION_USER,APPLICATION_ZUUL,APPLICATION_SSO);

}
