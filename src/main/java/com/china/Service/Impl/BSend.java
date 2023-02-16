package com.china.Service.Impl;

import com.by.Service.ISendMsg;

public class BSend implements ISendMsg {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
