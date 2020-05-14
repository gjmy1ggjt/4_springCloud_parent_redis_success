package com.example.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by Administrator on 2019/6/18.
 */
@Data
@TableName("sys_user")
public class User {

    @TableId(value = "id")
    private Integer id;

    private String userCode;

    private String userName;

    private String userPassword;

    private char userState;

}
