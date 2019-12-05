package com.hjs.dataencry;

import com.hjs.dataencry.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SysUserTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void test(){
        sysUserService.test();
    }


}
