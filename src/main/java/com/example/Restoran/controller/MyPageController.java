package com.example.Restoran.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MyPageController {

    @GetMapping("/page")
    public String paintMyPage(){
        return "MyPage";
    }

    @GetMapping("/cart")
    public String paintcart(){
        return "cart";
    }

    @GetMapping("/drinks")
    public String paintdrinks(){
        return "drinks";

    }
    @GetMapping("/pizza")
    public String paintpizza(){
        return "pizza";
    }

    @GetMapping("/profile")
    public String paintprofile(){
        return "profile";

    }

    @GetMapping("/snacks")
    public String paintsneki(){
        return "sneki";

    }

    @GetMapping("/sushi")
    public String paintsushi(){
        return "sushi";

    }


}
