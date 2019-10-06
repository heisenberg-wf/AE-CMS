package com.aplus.esport.frontier;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jarvis
 * @version V1.0
 * @desc: TODO
 * @date 2019/10/5 0005
 **/
@SpringBootApplication(scanBasePackages = "com.aplus.esport")
@MapperScan("com.aplus.esport.dal.**.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }
}
