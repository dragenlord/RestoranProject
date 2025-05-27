package com.example.Restoran.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/page")
public class MyPageController {

    @GetMapping("/menu")
    public String paintMyPage(){

        return "MyPage";

    }





}
