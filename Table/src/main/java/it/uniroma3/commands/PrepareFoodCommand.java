package it.uniroma3.commands;

import it.uniroma3.events.Status;

public class PrepareFoodCommand extends BaseCommand<String>{
    private String productId;
    private Status state;

    public PrepareFoodCommand(String id, String productId) {
        super(id);
        this.productId = productId;
        this.state = Status.FOOD_TO_SERVE;
    }
    public String getProductId(){ return this.productId;}
    public Status getState() {
        return this.state;
    }
}
