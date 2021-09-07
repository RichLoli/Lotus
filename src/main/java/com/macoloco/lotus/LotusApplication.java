package com.macoloco.lotus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.macoloco.lotus.dao")
public class LotusApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotusApplication.class, args);
    }

}
