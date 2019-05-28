package it.uniroma3.controller;

import io.swagger.annotations.Api;
import it.uniroma3.dto.commands.CreateFoodDTO;
import it.uniroma3.dto.commands.CreateOrderDTO;
import it.uniroma3.services.OrderService;
import it.uniroma3.services.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/orders")
@Api(value = "Order Commands", description = "Order Commands Related Endpoints", tags = "Order Commands")
public class TableController {
    private final OrderService orderService;

    public TableController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public CompletableFuture<String> createAccount(@RequestBody CreateOrderDTO createOrderDTO){
        return orderService.createOrder(createOrderDTO);
    }
    @PutMapping(value = "/{orderId}")
    public CompletableFuture<String> orderNewFood(@PathVariable(value = "orderId")String orderId, @RequestBody CreateFoodDTO createFoodDTO){
        return orderService.createFoodOrder(orderId, createFoodDTO);
    }


}
