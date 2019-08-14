package com.songsy.springcloud.plus.entity.role;

import com.songsy.springcloud.plus.entity.base.BaseDO;
import lombok.Data;

/**
 * @author songsy
 * @date 2019/8/14 18:49
 */
@Data
public class RoleDO extends BaseDO {

    private String roleName;

    private String roleCode;
}
