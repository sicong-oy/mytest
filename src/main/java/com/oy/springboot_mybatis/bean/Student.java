package com.oy.springboot_mybatis.bean;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private Long id;
    private String name;
    private String sex;
    private List<Subjects> subjectsList;
}
