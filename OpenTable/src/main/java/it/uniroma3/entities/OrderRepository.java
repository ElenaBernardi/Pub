package it.uniroma3.entities;

import it.uniroma3.entities.OrderQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderQueryEntity,String> {
}
