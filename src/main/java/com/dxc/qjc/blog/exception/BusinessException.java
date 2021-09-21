package com.dxc.qjc.blog.exception;

import lombok.Data;

/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName BusinessException
 * @CreateTime 2021-09-21 17:37
 * @Version 1.0
 * @Description: 自定义业务异常(非受检)
 */
@Data
public class BusinessException extends RuntimeException{
    private int code;
    private String message;
    public BusinessException(int code, String message){
        this.code = code;
        this.message = message;
    }
}
