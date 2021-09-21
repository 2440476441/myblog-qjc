package com.dxc.qjc.blog.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName UserVO
 * @CreateTime 2021-09-21 18:35
 * @Version 1.0
 * @Description: 返回用户视图对象
 */
@Data
public class UserVO {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("爱好")
    private String hobby;
    @ApiModelProperty
    private ClassVO classVO;
}
