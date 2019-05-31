package com.liantong.xinxi37spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class Xinxi37springApplication {

    public static void main(String[] args) {
        System.out.println("-------------------------start----------------------------");
        SpringApplication.run(Xinxi37springApplication.class, args);
        System.err.println("---------------------sucess!------------------------------");
    }

}
