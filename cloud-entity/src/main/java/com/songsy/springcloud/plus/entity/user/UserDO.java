package com.songsy.springcloud.plus.entity.user;

import com.songsy.springcloud.plus.entity.base.BaseDO;
import lombok.Data;

/**
 * @author songsy
 * @date 2019/8/14 18:49
 */
@Data
public class UserDO extends BaseDO {
    /**
     * userId
     */
    private String userId;
    /**
     * 账号
     */
    private String account;
    /**
     * 用户名
     */
    private String username;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
}
