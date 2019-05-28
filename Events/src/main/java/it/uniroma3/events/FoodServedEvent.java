package it.uniroma3.events;


public class FoodServedEvent extends BaseEvent<String>{
    private Status state;

    public FoodServedEvent(String id, Status state) {
        super(id);
        this.state = state;
    }
    public Status getState(){
        return this.state;
    }
}
