package com.by.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class OrderController {

    @GetMapping("/api/order")
    public String Hello() {
        return "Hello World!";
    }



    @Value("${boy.name}")
    private String firstName;

   @Value("${demo.my.date3}")
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private LocalDateTime date3;

   @Value("#{100-3}")
   private int maxConnection;

    @Value("${boy.hobbyArray}")
    private String[] hobbyArray;

    @Value("${boy.address}")
    private String address;


    @GetMapping("/api/name")
    public String name(){
        return firstName;
    }

    @GetMapping("/api/date")
    public Object date(){
        return  date3;
    }


    @GetMapping("/api/max")
    public Integer max(){
        return maxConnection;
    }




}
