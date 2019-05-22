package it.uniroma3.commands;

import it.uniroma3.aggregates.Status;

public class FoodOrderedCommand extends BaseCommand<String>{
    private String lineItemId;
    private String productId;
    private Boolean isDrink;
    private Long price;
    private Status state;

    public FoodOrderedCommand(String lineItemId, String productId, Long price) {
        super(lineItemId);
        this.productId = productId;
        this.isDrink = false;
        this.price = price;
        this.state = Status.FOOD_TO_PREPARE;
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
