package it.uniroma3.services;

import it.uniroma3.entities.OrderLineItem;
import it.uniroma3.entities.OrderQueryEntity;
import it.uniroma3.entities.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderQueryServiceImpl implements OrderQueryService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderQueryEntity findById(String orderId) {
        return orderRepository.findById(orderId).get();
    }
}
