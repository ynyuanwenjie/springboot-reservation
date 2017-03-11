package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanwenjie on 2017/3/11.
 */
@RestController
@RequestMapping("/home")
public class ReservationController {

    @RequestMapping("/")
    public String home(){
        System.out.println("------------------------");
        return "HOME";
    }
}
