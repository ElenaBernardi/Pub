package it.uniroma3.services;

import it.uniroma3.commands.CreateOrderCommand;
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

    @Override
    public CompletableFuture<String> createOrder(CreateOrderDTO createOrderDTO) {
        /*
         * usando il metodo send viene inviato un comando e
         * si mette in attesa di una risposta*/
        return commandGateway.send(new CreateOrderCommand(UUID.randomUUID().toString(), createOrderDTO.getTableNumber(), createOrderDTO.getWaiter()));

    }

    @Override
    public CompletableFuture<String> closeTable() {
        return null;
    }

    @Override
    public CompletableFuture<String> createDrinkOrder() {
        return null;
    }

    @Override
    public CompletableFuture<String> createFoodOrder() {
        return null;
    }

    @Override
    public CompletableFuture<String> prepareFood() {
        return null;
    }

    @Override
    public CompletableFuture<String> serveDrink() {
        return null;
    }

    @Override
    public CompletableFuture<String> serveFood() {
        return null;
    }
}
