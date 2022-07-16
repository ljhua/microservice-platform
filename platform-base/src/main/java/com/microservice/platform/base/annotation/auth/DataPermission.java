package com.microservice.platform.base.annotation.auth;

import java.lang.annotation.*;

/**
 * 数据权限过滤
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(DataPermissions.class)
public @interface DataPermission {

    /**
     * 需要做数据权限主表
     *
     * @return
     */
    String dataTableName() default "";

    /**
     * 需要做数据权限表的别名
     *
     * @return
     */
    String dataTableAlias() default "";

    /**
     * 数据权限需要排除的字段
     *
     * @return
     */
    String dataColumnExclude() default "";

    /**
     * 数据权限需要保留的字段
     *
     * @return
     */
    String dataColumnInclude() default "";

    /**
     * 数据权限表
     *
     * @return
     */
    String innerTableName() default "t_sys_organization";

    /**
     * 数据权限表的别名
     *
     * @return
     */
    String innerTableAlias() default "dpOrg";

    /**
     * 数据权限类型:1只能查看本人 2只能查看本部门 3只能查看本部门及子部门 4可以查看所有数据 5 自定义
     *
     * @return
     */
    String datePermissionType() default "";

    /**
     * 自定义数据权限类型
     *
     * @return
     */
    String customExpression() default "";
}
