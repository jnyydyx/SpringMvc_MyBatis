package com.china.config;

import com.china.Model.Book;
import org.springframework.context.annotation.Bean;

public class AllBean {
    @Bean
    public Book book() {
        return new Book();
    }
}
