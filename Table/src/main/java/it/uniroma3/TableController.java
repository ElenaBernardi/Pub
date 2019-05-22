package it.uniroma3;

import io.swagger.annotations.Api;
import it.uniroma3.dto.commands.CreateOrderDTO;
import it.uniroma3.services.OrderServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/orders")
@Api(value = "Order Commands", description = "Order Commands Related Endpoints", tags = "Order Commands")
public class TableController {
    private final OrderServiceImpl orderService;

    public TableController(OrderServiceImpl orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public CompletableFuture<String> createAccount(@RequestBody CreateOrderDTO createOrderDTO){
        return orderService.createOrder(createOrderDTO);
    }


}
