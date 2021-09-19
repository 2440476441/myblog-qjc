package com.dxc.qjc.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName TestController
 * @CreateTime 2021-09-18 16:52
 * @Version 1.0
 * @Description: 测试swagger
 */
@Api(tags = "一个测试")
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("/m1")
    @ApiOperation(value = "查询",notes = "查询")
    public String getString(){
        return "你是孤儿吗？";
    }
    @GetMapping("/m2")
    @ApiOperation(value = "查询",notes = "查询")
    public String getString02(){
        return "你是孤儿吗？";
    }
    @GetMapping("/m3")
    @ApiOperation(value = "查询",notes = "查询")
    public String getString03(){
        return "你是孤儿吗？";
    }

}
