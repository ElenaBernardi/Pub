package it.uniroma3.events;


public class FoodPreparedEvent extends BaseEvent<String>{
    private Status state;

    public FoodPreparedEvent(String id, Status state) {
        super(id);
        this.state = state;
    }
    public Status getState(){
        return this.state;
    }
}
