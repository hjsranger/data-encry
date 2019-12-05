package com.hjs.dataencry.service;

import com.hjs.dataencry.mapper.SysUserMapper;
import com.hjs.dataencry.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public void test(){
        SysUser sysUser = new SysUser();
        sysUser.setQueryString("不");
        sysUser.setKey("IDG OA DES");

        List<SysUser> userList = sysUserMapper.selectEncry(sysUser);

        for (SysUser user : userList) {
            System.out.println(user.toString());
        }

    }

}
