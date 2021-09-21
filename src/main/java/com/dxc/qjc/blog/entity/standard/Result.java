package com.dxc.qjc.blog.entity.standard;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName Result
 * @CreateTime 2021-09-21 18:04
 * @Version 1.0
 * @Description: 标准返回格式
 */
@Data
public class Result<T> {
    @ApiModelProperty("状态码")
    private int code;
    @ApiModelProperty("返回值信息")
    private String message;
    @ApiModelProperty("返回数据")
    private T data;

    public Result(int code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    //操作成功
    public static Result OK(String message,Object data){
        return new Result(200,message,data);
    }
    //操作失败
    public static Result ERROR(String message,Object data){
        return new Result(500,message,data);
    }
}
