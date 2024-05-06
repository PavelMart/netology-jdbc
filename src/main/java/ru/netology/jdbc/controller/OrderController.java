package ru.netology.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.entity.OrderEntity;
import ru.netology.jdbc.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository productRepository) {
        this.orderRepository = productRepository;
    }

    @GetMapping("/fetch-product")
    public List<String> fetchProduct(@RequestParam String name) {
        return orderRepository.getProductsByCustomerName(name);
    }
}
