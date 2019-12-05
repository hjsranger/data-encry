package com.hjs.dataencry.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjs.dataencry.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectEncry(@Param("query") SysUser sysUser);

}
