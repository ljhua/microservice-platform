package com.microservice.platform.base.service;

@FunctionalInterface
public interface IAction<T> {

    /**
     * 执行回调
     *
     * @param param
     */
    void run(T param);
}

