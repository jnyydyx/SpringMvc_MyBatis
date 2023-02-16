package com.by;

import com.by.Service.ISendMsg;
import com.china.Model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.ClassUtils;

import java.util.List;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        List<String> names= SpringFactoriesLoader.loadFactoryNames(ISendMsg.class, ClassUtils.getDefaultClassLoader());
        List<ISendMsg> iSendMsgs=SpringFactoriesLoader.loadFactories(ISendMsg.class,ClassUtils.getDefaultClassLoader());

        for(ISendMsg sendMsg:iSendMsgs){
            sendMsg.send();
        }

        ConfigurableApplicationContext context = SpringApplication.run(Main.class,args);
        Book bean = context.getBean(Book.class);

    }
}
