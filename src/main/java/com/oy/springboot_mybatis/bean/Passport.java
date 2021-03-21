package com.oy.springboot_mybatis.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Passport {
    private Integer id;
    private String nationality;
    private Date expire;
    private String passenger_id;
    private Passenger passenger;
}
