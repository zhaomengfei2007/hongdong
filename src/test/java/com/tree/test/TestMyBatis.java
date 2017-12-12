package com.tree.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.tree.entity.User;
import com.tree.service.UserService.IUserService;

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private IUserService userService = null;  
    @Test  
    public void test1() {
        User user = userService.getUserById(1);
    }
}
