package com.hjs.dataencry.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysUser {

    @TableId
    private String id;
    private String name;
    private String info;

}
