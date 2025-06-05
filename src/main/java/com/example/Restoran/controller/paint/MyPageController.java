package com.example.Restoran.controller.paint;


import com.example.Restoran.repository.*;

import com.example.Restoran.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class MyPageController {

    private final DrinkRepository drinkRepository;
    private final PizzaRepository pizzaRepository;
    private final SnecksRepository snecksRepository;
    private final SushiRepository sushiRepository;
    private final OrderService orderService;



    @GetMapping("/page")
    public String paintMyPage(){

        return "MyPage";
    }


    @GetMapping("/drinks")
    public String paintdrinks(Model model){
        model.addAttribute("drink", drinkRepository.findAll());
        return "drinks";

    }

    @GetMapping("/pizza")
    public String showPizza(Model model) {
        model.addAttribute("pizzas", pizzaRepository.findAll());
        return "pizza";
    }

    @GetMapping("/profile")
    public String paintprofile(){
        return "profile";

    }

    @GetMapping("/snacks")
    public String paintsneki(Model model){
        model.addAttribute("snecks", snecksRepository.findAll());
        return "sneki";

    }

    @GetMapping("/sushi")
    public String paintsushi(Model model){
        model.addAttribute("sushi", sushiRepository.findAll());
        return "sushi";

    }

    @GetMapping("fullmenu")
    public String paintfullmenu(){
        return "fullmenu";
    }



}
