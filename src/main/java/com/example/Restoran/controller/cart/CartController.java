package com.example.Restoran.controller.cart;


import com.example.Restoran.entity.Order;
import com.example.Restoran.entity.cart;
import com.example.Restoran.repository.CartRepository;

import com.example.Restoran.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class CartController {

    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;

    @GetMapping("/api/cart")
    public String getCart(Model model) {
        model.addAttribute("cartItems", cartRepository.findAll());
        return "cart";

    }

    @PostMapping("/api/cart/remove/{id}")
    public String removeFromCart(@PathVariable Long id) {
        cartRepository.deleteById(id);
        return"redirect:/api/cart";
    }

    @GetMapping("/api/cart/checkout")
    public String checkout(Model model) {
        double totalPrice = cartRepository.findAll().stream()
                .mapToDouble(cart::getItemPrice)
                .sum();
        model.addAttribute("totalPrice", totalPrice);
        return "checkout";
    }
    @PostMapping("/api/cart/placeOrder")
    public String placeOrder(@RequestParam String name, @RequestParam String address, @RequestParam Double totalPrice) {
        // Логика обработки заказа
        cartRepository.deleteAll();
        return "redirect:/order-confirmation"; // Перенаправление на страницу подтверждения заказа
    }

    @PostMapping()
    public String checkout(@RequestParam String name,@RequestParam double prise,@RequestParam String address ) {
        Order order = new Order(null, name, prise, address);
        orderRepository.save(order);
        return "redirect:/api/cart";
    }

    @PostMapping("/api/cart/add/sushi")
    public String addCartsushi(@RequestParam Long itemId,@RequestParam String itemName,@RequestParam double itemPrice ){
        cart Cart = new cart(null,itemId,itemName,itemPrice);
        cartRepository.save(Cart);
        return "redirect:api/sushi";
    }

    @PostMapping("/api/cart/add/pizza")
    public String addCartpizza(@RequestParam Long itemId,@RequestParam String itemName,@RequestParam double itemPrice ){
        cart Cart = new cart(null,itemId,itemName,itemPrice);
        cartRepository.save(Cart);
        return "redirect:/api/pizza";
    }

    @PostMapping("/api/cart/add/snecks")
    public String addCartsnecks(@RequestParam Long itemId,@RequestParam String itemName,@RequestParam double itemPrice ){
        cart Cart = new cart(null,itemId,itemName,itemPrice);
        cartRepository.save(Cart);
        return "redirect:/api/snacks";
    }

    @PostMapping("api/cart/add/drinks")
    public String addCartdrinks(@RequestParam Long itemId,@RequestParam String itemName,@RequestParam double itemPrice ){
        cart Cart = new cart(null,itemId,itemName,itemPrice);
        cartRepository.save(Cart);
        return "redirect:/api/drinks";
    }

}