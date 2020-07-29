package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxUserService {
    public User getinfo(int Uid){
        User user =(User) BeanUtil.getBean("user");
        user.setAddress("北京");
        user.setId(Uid);
        user.setName("张三");
        return user;
    }
}
