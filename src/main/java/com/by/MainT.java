package com.by;


import com.by.Model.Boy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
@MapperScan("com.by.Mapper")
public class MainT {

    public static void main(String[] args) {



        ConfigurableApplicationContext context = SpringApplication.run(MainT.class, args);

        Boy bean = context.getBean(Boy.class);
        System.out.println(bean);
    }

}
