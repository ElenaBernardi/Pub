package it.uniroma3.services;

import it.uniroma3.dto.commands.CreateDrinkDTO;
import it.uniroma3.dto.commands.CreateFoodDTO;
import it.uniroma3.dto.commands.CreateOrderDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderService {
    public CompletableFuture<String> createOrder(CreateOrderDTO createOrderDTO);
    public CompletableFuture<String> closeTable(String orderId);
    public CompletableFuture<String> createDrinkOrder(String orderId, CreateDrinkDTO createDrinkDTO);
    public CompletableFuture<String> createFoodOrder(String orderId, CreateFoodDTO createFoodDTO);
    public CompletableFuture<String> prepareFood(String orderId, String productId);
    public CompletableFuture<String> serveDrink(String orderId, String productId);
    public CompletableFuture<String> serveFood(String orderId, String productId);
}
