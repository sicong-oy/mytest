package com.oy.springboot_mybatis.dao;

import com.oy.springboot_mybatis.bean.Passenger;

public interface TestDao {
    public Passenger selectPassengerById(Integer id);
}
