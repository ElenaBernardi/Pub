package it.uniroma3.services;

import it.uniroma3.entities.OrderLineItem;
import it.uniroma3.entities.OrderQueryEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderQueryService {
    public OrderQueryEntity findById(String orderId);
}
