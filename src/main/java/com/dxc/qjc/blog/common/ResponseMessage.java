package com.dxc.qjc.blog.common;

/**
 * @Author 权计超
 * Company DXC.technology
 * @ClassName ResponseMessage
 * @CreateTime 2021-09-21 18:47
 * @Version 1.0
 * @Description: 返回信息
 */
public class ResponseMessage {
    /**
     * 私有化构造方法
     */
    private ResponseMessage(){}

    public static final String INSERTSUCCESS = "插入成功";
    public static final String INSERTFAIL = "插入失败";

    public static final String DELETESUCCESS = "删除成功";
    public static final String DELETEFAIL = "删除失败";

    public static final String UPDATESUCCESS = "修改成功";
    public static final String UPDATEFAIL = "修改失败";

    public static final String SELECTSUCCESS = "查询成功";
    public static final String SELECTFAIL = "查询失败";
}
