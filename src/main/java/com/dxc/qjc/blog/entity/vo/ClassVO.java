package com.dxc.qjc.blog.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName ClassVO
 * @CreateTime 2021-09-21 18:41
 * @Version 1.0
 * @Description: 班级视图类
 */
@Data
public class ClassVO {
    @ApiModelProperty("年级")
    private String nianji;
    @ApiModelProperty("人数")
    private int member;
}
