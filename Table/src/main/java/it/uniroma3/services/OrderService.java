package it.uniroma3.services;

import it.uniroma3.dto.commands.CreateOrderDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderService {
    public CompletableFuture<String> createOrder(CreateOrderDTO createOrderDTO);
    public CompletableFuture<String> closeTable();
    public CompletableFuture<String> createDrinkOrder();
    public CompletableFuture<String> createFoodOrder();
    public CompletableFuture<String> prepareFood();
    public CompletableFuture<String> serveDrink();
    public CompletableFuture<String> serveFood();
}
