package com.imooc.spring;

import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meihao")
public class MsController {

    @RequestMapping("/getAll")
    public String getAll(){

        return "这个这美女好漂亮";
    }
    @RequestMapping("/getUser")
    public User getUser(){
       User u= new User();
       u.setAge(20);
       u.setName("张无忌234");
        User user = new User();
        user.setName("马蹄莲");
        user.setAge(30);
     return u;
    }
}
