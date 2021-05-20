package com.inventorymanagementsystem.controller;

import com.inventorymanagementsystem.entity.Customer;
import com.inventorymanagementsystem.mapper.CustomerMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    CustomerMapper customerMapper;
    @RequestMapping("/test")
    public void test(){
        Customer customer = customerMapper.selectByPrimaryKey(1);
        System.out.println(customer.getName());
    }
}
