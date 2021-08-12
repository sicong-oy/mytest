package com.oy.springboot_mybatis.controller;

import com.oy.springboot_mybatis.bean.Passenger;
import com.oy.springboot_mybatis.bean.Student;
import com.oy.springboot_mybatis.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @GetMapping("/test")
    public Passenger test(@RequestParam Integer id){
        return testService.showList(id);
    }

    @GetMapping("/testCollection")
    public Student testcollection(){
        return testService.showStudent();
    }

}
