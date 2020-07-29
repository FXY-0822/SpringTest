package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.WxUserService;
import com.example.demo.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common/course/")
public class WxUserController {
    @Autowired
    private WxUserService service;
    @GetMapping("h1")
    public User getinfo(@RequestParam("id") int Uid){
        return service.getinfo(Uid);
    }
}
