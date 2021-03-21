package com.oy.springboot_mybatis;

import com.oy.springboot_mybatis.bean.Passenger;
import com.oy.springboot_mybatis.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private TestDao testDao;
    @Test
    void contextLoads() {
        Passenger passenger = testDao.selectPassengerById(1001);
        System.out.println(passenger);
    }

}
