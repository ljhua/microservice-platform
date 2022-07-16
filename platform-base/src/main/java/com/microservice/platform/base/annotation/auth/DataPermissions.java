package com.microservice.platform.base.annotation.auth;

import java.lang.annotation.*;

/**
 * 数据权限过滤
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataPermissions {
    /**
     * 需要做数据权限主表
     *
     * @return
     */
    DataPermission[] value();
}
