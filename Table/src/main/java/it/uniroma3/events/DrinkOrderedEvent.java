package it.uniroma3.events;

import it.uniroma3.aggregates.Status;

public class DrinkOrderedEvent  extends BaseEvent<String>{

    private String lineItemId;
    private String productId;
    private Boolean isDrink;
    private Long price;
    private Status state;

    public DrinkOrderedEvent(String lineItemId, String productId, Boolean isDrink, Long price, Status state) {
        super(lineItemId);
        this.productId = productId;
        this.isDrink = isDrink;
        this.price = price;
        this.state = state;
    }

    public String getLineItemId() {
        return lineItemId;
    }

    public String getProductId() {
        return productId;
    }

    public Boolean getIsDrink() {
        return isDrink;
    }

    public Long getPrice() {
        return price;
    }

    public Status getState() {
        return state;
    }
}
