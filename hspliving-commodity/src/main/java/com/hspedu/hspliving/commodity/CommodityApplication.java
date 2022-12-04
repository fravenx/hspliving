package com.hspedu.hspliving.commodity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author fraven
 * @Description
 * @Date 2022/12/04/16:51
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.hspedu.hspliving.commodity")
public class CommodityApplication {
    public static void main(String[] args) {

        SpringApplication.run(CommodityApplication.class,args);
    }
}
