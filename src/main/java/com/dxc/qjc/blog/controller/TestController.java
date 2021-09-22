package com.dxc.qjc.blog.controller;

import com.dxc.qjc.blog.common.ResponseMessage;
import com.dxc.qjc.blog.entity.standard.Result;
import com.dxc.qjc.blog.entity.vo.UserVO;
import com.dxc.qjc.blog.exception.BusinessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Result<UserVO> getString(@ApiParam(value = "是否sb",required = true) @RequestParam int pass){
//        if (1==pass){
//            throw new BusinessException(501, ResponseMessage.SELECTFAIL);
//        }
        return Result.OK(ResponseMessage.SELECTSUCCESS,new UserVO());
    }

}
