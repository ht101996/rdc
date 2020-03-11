package com.minehome.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName rdc
 * @Description: 接口文件
 * @Author taomike
 * @Date 2020/3/11
 **/
@RequestMapping("/api")
public class Rdc {
    @RequestMapping("/health")
    public String health() {
        return "ok";
    }
}
