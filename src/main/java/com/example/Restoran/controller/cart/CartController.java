package com.example.Restoran.controller.cart;


import com.example.Restoran.entity.cartEntity.cartDrink;
import com.example.Restoran.entity.cartEntity.cartPizza;
import com.example.Restoran.entity.drinks;
import com.example.Restoran.entity.pizza;
import com.example.Restoran.repository.DrinkRepository;
import com.example.Restoran.repository.cartRepository.CartDrinkRepository;
import com.example.Restoran.repository.cartRepository.CartPizzaRepository;
import com.example.Restoran.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class CartController {
        private final CartDrinkRepository cartDrinkRepository;
        private final OrderService orderService;
        private final CartPizzaRepository cartPizzaRepository;


    @PostMapping("api/cart/add")
    public String addDrinkFromCart(cartDrink drink) {
        cartDrinkRepository.save(drink);
        return "redirect:/api/drinks";
    }

    @PostMapping("api/cart/add/pizza")
    public String addPizzaFromCart(cartPizza pizza) {
        cartPizzaRepository.save(pizza);
        return "redirect:/api/pizza";
    }


}
