package com.example.Restoran.controller.cart;


import com.example.Restoran.entity.OrderItem;
import com.example.Restoran.entity.Orders;
import com.example.Restoran.entity.cart;
import com.example.Restoran.repository.CartRepository;

import com.example.Restoran.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

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
    public String checkouts(Model model) {
        double totalPrice = cartRepository.findAll().stream()
                .mapToDouble(cart::getItemPrice)
                .sum();
        model.addAttribute("totalPrice", totalPrice);
        return "checkout";

    }

    @PostMapping("/api/cart/add/sushi")
    public String addCartsushi(@RequestParam Long itemId,@RequestParam String itemName,@RequestParam double itemPrice ){
        cart Cart = new cart(null,itemId,itemName,itemPrice);
        cartRepository.save(Cart);
        return "redirect:/api/sushi";

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


    @PostMapping("/api/cart/placeOrder")
    @Transactional
    public String plaseOrder(@RequestParam String name,
                             @RequestParam double totalPrice,
                             @RequestParam String address) {
        List<cart> cartItems = cartRepository.findAll();
        List<OrderItem> orderItems = cartItems.stream()
                .map(cart -> {
                    OrderItem item = new OrderItem();
                    item.setItemId(cart.getItemId());
                    item.setItemName(cart.getItemName());
                    item.setItemPrice(cart.getItemPrice());

                    return item;
                })
                .collect(Collectors.toList());

        Orders orderss = new Orders();
        orderss.setName(name);
        orderss.setTotalPrice(totalPrice);
        orderss.setAddress(address);
        orderss.setItems(orderItems);
        orderRepository.save(orderss);
        cartRepository.deleteAll();

        return "redirect:/api/page";
    }

}