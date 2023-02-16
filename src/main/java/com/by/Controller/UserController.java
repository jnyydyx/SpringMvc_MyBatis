package com.by.Controller;

import com.by.Exception.BizException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String user() {
        //throw new BizException("业务异常");
        return "用户";
    }
    @GetMapping("/login")
    public String login() {
        return "登录";
    }
    @GetMapping("/register")
    public String register() {
        return "注册";
    }
}
