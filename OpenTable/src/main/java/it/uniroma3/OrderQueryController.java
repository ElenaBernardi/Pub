package it.uniroma3;

import io.swagger.annotations.Api;
import it.uniroma3.entities.OrderLineItem;
import it.uniroma3.entities.OrderQueryEntity;
import it.uniroma3.services.OrderQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/order")
@Api(value = "Order Query", description = "Order Query Related Endpoints", tags = "Order Query")

public class OrderQueryController {
    private final OrderQueryService orderService;

    public OrderQueryController(OrderQueryService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderQueryEntity> findById(@PathVariable String id) {
        OrderQueryEntity order = orderService.findById(id);
        if (order!=null) {
            return new ResponseEntity<>(order, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    }
