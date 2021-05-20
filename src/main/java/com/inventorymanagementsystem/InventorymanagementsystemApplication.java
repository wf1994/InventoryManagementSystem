package com.inventorymanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@MapperScan("com.inventorymanagementsystem.mapper")
public class InventorymanagementsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventorymanagementsystemApplication.class, args);
    }

}
