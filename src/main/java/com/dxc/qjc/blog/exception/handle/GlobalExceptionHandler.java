package com.dxc.qjc.blog.exception.handle;

import com.dxc.qjc.blog.entity.standard.Result;
import com.dxc.qjc.blog.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName GlobalExceptionHandler
 * @CreateTime 2021-09-21 17:46
 * @Version 1.0
 * @Description: 全局异常处理类
 */
//定义该类为全局异常处理类
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public Result exceptionHandler(BusinessException e){
        log.error("服务出错",e);
        return new Result(e.getCode(),e.getMessage(),null);
    }
}
