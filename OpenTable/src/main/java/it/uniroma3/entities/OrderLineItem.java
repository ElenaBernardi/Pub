package it.uniroma3.entities;

import it.uniroma3.events.Status;

import javax.persistence.Embeddable;

@Embeddable
public class OrderLineItem {
    private String lineItemId;
    private String productId;
    private Boolean isDrink;
    private Long price;
    private Status state;

    public OrderLineItem() {
    }

    public String getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Boolean getDrink() {
        return isDrink;
    }

    public void setDrink(Boolean drink) {
        isDrink = drink;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }
}
