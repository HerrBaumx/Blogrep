package com.jxiao;

import com.jxiao.entity.User;
import com.jxiao.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ThirdHomeworkApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.getById(5);
        System.out.println(user.toString());
    }

}
