package it.uniroma3.events;

import it.uniroma3.aggregates.Status;

public class FoodServedEvent extends BaseEvent<String>{
    private String id;
    private Status state;

    public FoodServedEvent(String id, Status state) {
        super(id);
        this.state = state;
    }
    public String getId(){return this.id;}
    public Status getState(){
        return this.state;
    }
}
