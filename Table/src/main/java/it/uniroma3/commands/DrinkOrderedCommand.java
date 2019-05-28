package it.uniroma3.commands;

import it.uniroma3.events.Status;

public class DrinkOrderedCommand extends BaseCommand<String>{
    private String productId;
    private Boolean isDrink;
    private Long price;
    private Status state;

    public DrinkOrderedCommand(String lineItemId, String productId, Long price) {
        super(lineItemId);
        this.productId = productId;
        this.isDrink = true;
        this.price = price;
        this.state = Status.DRINK_TO_SERVE;
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
