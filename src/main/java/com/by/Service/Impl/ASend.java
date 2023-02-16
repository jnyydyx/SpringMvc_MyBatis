package com.by.Service.Impl;

import com.by.Service.ISendMsg;

public class ASend implements ISendMsg {
    @Override
    public void send(){
        System.out.println("发短信");
    }
}
