package com.oy.springboot_mybatis.dao;

import com.oy.springboot_mybatis.bean.Passenger;
import com.oy.springboot_mybatis.bean.Student;

public interface TestDao {
    public Passenger selectPassengerById(Integer id);

    Student selectStudent();
}
