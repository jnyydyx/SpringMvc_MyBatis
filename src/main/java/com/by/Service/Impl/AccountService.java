package com.by.Service.Impl;


import com.by.Mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Slf4j
public class AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Transactional
    public Integer transfer(String from, String to,int money){
        accountMapper.minusMoney(from,money);
        //if (money.equals(Integer.valueOf(5))){
            //int a =7/0;
       // }
        accountMapper.addMoney(to,money);
        return 1;
    }
}
