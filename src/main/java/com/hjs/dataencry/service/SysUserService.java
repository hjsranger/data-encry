package com.hjs.dataencry.service;

import com.hjs.dataencry.mapper.SysUserMapper;
import com.hjs.dataencry.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public void test(){
        SysUser sysUser = sysUserMapper.selectById("hjs");
        System.out.println(sysUser.getInfo());

    }

}
