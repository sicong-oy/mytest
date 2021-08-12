package com.oy.springboot_mybatis.service;

import com.oy.springboot_mybatis.bean.Passenger;
import com.oy.springboot_mybatis.bean.Student;

public interface TestService {
    Passenger showList(Integer id);
    Student showStudent();
}
