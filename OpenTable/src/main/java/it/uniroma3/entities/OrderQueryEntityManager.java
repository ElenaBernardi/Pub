package it.uniroma3.entities;

import it.uniroma3.events.TableOpenedEvent;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.queryhandling.QueryUpdateEmitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderQueryEntityManager {

    @Autowired
    private OrderRepository orderRepository;


    @EventHandler
    public void on(TableOpenedEvent evt) {
        List<OrderLineItem> items = new ArrayList<>();
        System.out.println("######### "+evt.getId()+" ############");
        orderRepository.save(new OrderQueryEntity(evt.getId(), evt.getTableNumber(), evt.getWaiter(), evt.getIsOpen(), items, 0L, 0L, 0L));
    }

}
