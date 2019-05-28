package it.uniroma3.services;

import it.uniroma3.commands.*;
import it.uniroma3.dto.commands.CreateDrinkDTO;
import it.uniroma3.dto.commands.CreateFoodDTO;
import it.uniroma3.dto.commands.CreateOrderDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class OrderServiceImpl implements OrderService{
    /* CommandGateway è un'interfaccia offerta da Axon che serve
  ad inviare comandi.
  * Axon fornirà effettivamente l'implementazione
  * DefaultCommandGateway
  */
    private final CommandGateway commandGateway;

    public OrderServiceImpl(CommandGateway commandGateway){
        this.commandGateway = commandGateway;
    }
    //finito
    @Override
    public CompletableFuture<String> createOrder(CreateOrderDTO createOrderDTO) {
        /*
         * usando il metodo send viene inviato un comando e
         * si mette in attesa di una risposta*/
        CreateOrderCommand cmd = new CreateOrderCommand(UUID.randomUUID().toString(), createOrderDTO.getTableNumber(), createOrderDTO.getWaiter());

        return commandGateway.send(cmd);

    }
    //finito
    @Override
    public CompletableFuture<String> closeTable(String orderId) {
        CloseTableCommand cmd = new CloseTableCommand(orderId);
        return commandGateway.send(cmd);
    }

    @Override
    public CompletableFuture<String> createDrinkOrder(String orderId, CreateDrinkDTO createDrinkDTO) {
        DrinkOrderedCommand cmd = new DrinkOrderedCommand(orderId, createDrinkDTO.getProductId(), createDrinkDTO.getPrice());
        return commandGateway.send(cmd);
    }

    @Override
    public CompletableFuture<String> createFoodOrder(String orderId, CreateFoodDTO createFoodDTO) {

        FoodOrderedCommand cmd = new FoodOrderedCommand(orderId, createFoodDTO.getProductId(), createFoodDTO.getPrice());
        return commandGateway.send(cmd);
    }

    @Override
    public CompletableFuture<String> prepareFood(String orderId, String productId) {

        PrepareFoodCommand cmd = new PrepareFoodCommand(orderId, productId);
        return commandGateway.send(cmd);
    }

    @Override
    public CompletableFuture<String> serveDrink(String orderId, String productId) {

        ServeDrinkCommand cmd = new ServeDrinkCommand(orderId, productId);
        return commandGateway.send(cmd);
    }

    @Override
    public CompletableFuture<String> serveFood(String orderId, String productId) {
        ServeFoodCommand cmd = new ServeFoodCommand(orderId, productId);
        return commandGateway.send(cmd);
    }
}
