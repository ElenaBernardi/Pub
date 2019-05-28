package it.uniroma3.aggregates;

import it.uniroma3.events.*;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.EntityId;

public class OrderLineItem {
    @EntityId
    private String lineItemId;
    private String productId;
    private Boolean isDrink;
    private Long price;
    private Status state;

    public OrderLineItem(){}

    @EventSourcingHandler
    public void on(DrinkOrderedEvent evt){
        this.lineItemId = evt.getId();
        this.productId = evt.getProductId();
        this.isDrink = evt.getIsDrink();
        this.price = evt.getPrice();
        this.state = evt.getState();
    }

    @EventSourcingHandler
    public void on(DrinkServedEvent evt){
        this.state = evt.getState();
    }

    @EventSourcingHandler
    public void on(FoodOrderedEvent evt){
        this.lineItemId = evt.getId();
        this.productId = evt.getProductId();
        this.isDrink = evt.getIsDrink();
        this.price = evt.getPrice();
        this.state = evt.getState();
    }

    @EventSourcingHandler
    public void on(FoodPreparedEvent evt){
        this.state = evt.getState();
    }

    @EventSourcingHandler
    public void on(FoodServedEvent evt){
        this.state = evt.getState();
    }
}
