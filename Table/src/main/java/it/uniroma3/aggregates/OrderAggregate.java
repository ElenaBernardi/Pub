package it.uniroma3.aggregates;

import it.uniroma3.commands.*;
import it.uniroma3.events.*;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.spring.stereotype.Aggregate;
import static org.axonframework.modelling.command.AggregateLifecycle.apply;

import java.util.List;

//questa annotazione indica ad Axon che questa enetità
//verrà gestita da Axon. Come @Entity per JPA
@Aggregate
public class OrderAggregate {
    //serve per identificare un'istanza particolare di aggregato
    //Come @Id per JPA
    @AggregateIdentifier
    private String id;
    private Long tableNumber;
    private String waiter;
    private Boolean isOpen;
    @AggregateMember
    private List<OrderLineItem> items;
    private Long bill;
    private Long amount_paid;
    private Long tip;

    public OrderAggregate(){}

    @EventSourcingHandler
    public void on(TableOpenedEvent evt){
        this.id = evt.getId();
        this.tableNumber =evt.getTableNumber();
        this.waiter = evt.getWaiter();
        this.isOpen = evt.getIsOpen();
    }
    @EventSourcingHandler
    public void on(TableClosedEvent evt){
        this.isOpen = evt.getIsOpen();
    }
    @CommandHandler
    public void on(CreateOrderCommand cmd){
        apply(new TableOpenedEvent(cmd.getId(), cmd.getTableNumber(), cmd.getWaiter(), cmd.getOpen()));
    }
    @CommandHandler
    public void on(DrinkOrderedCommand cmd){
        apply(new DrinkOrderedEvent(cmd.getLineItemId(),cmd.getProductId(),cmd.getIsDrink(),cmd.getPrice(), cmd.getState()));
    }
    @CommandHandler
    public void on(FoodOrderedCommand cmd){
        apply(new FoodOrderedEvent(cmd.getLineItemId(),cmd.getProductId(),cmd.getIsDrink(),cmd.getPrice(),cmd.getState()));
    }
    @CommandHandler
    public void on(CloseTableCommand cmd){
        apply(new TableClosedEvent(cmd.getId(),cmd.getIsOpen()));
    }
    @CommandHandler
    public void on(ServeDrinkCommand cmd){
        apply(new DrinkServedEvent(cmd.getId(),cmd.getState()));
    }
    @CommandHandler
    public void on(ServeFoodCommand cmd){
        apply(new FoodServedEvent(cmd.getId(),cmd.getState()));
    }
    @CommandHandler
    public void on(PrepareFoodCommand cmd){
        apply(new FoodPreparedEvent(cmd.getId(),cmd.getState()));
    }
}
