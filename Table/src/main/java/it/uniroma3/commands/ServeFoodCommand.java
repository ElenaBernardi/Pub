package it.uniroma3.commands;

import it.uniroma3.events.Status;

public class ServeFoodCommand extends BaseCommand<String>{
    private String productId;
    private Status state;

    public ServeFoodCommand(String id, String productId) {
        super(id);
        this.productId = productId;
        this.state = Status.SERVED;
    }
    public String getProductId(){ return this.productId;}
    public Status getState() {
        return this.state;
    }
}
