package it.uniroma3.events;

import it.uniroma3.aggregates.Status;

public class FoodPreparedEvent extends BaseEvent<String>{
    private String id;
    private Status state;

    public FoodPreparedEvent(String id, Status state) {
        super(id);
        this.state = state;
    }
    public String getId(){return this.id;}
    public Status getState(){
        return this.state;
    }
}
