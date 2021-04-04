package com.oy.springboot_mybatis.service;

import com.oy.springboot_mybatis.bean.Passenger;
import com.oy.springboot_mybatis.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService{
    @Resource
    private TestDao testDao;

    @Override
    public Passenger showList(Integer id) {
        return testDao.selectPassengerById(id);
    }

}
