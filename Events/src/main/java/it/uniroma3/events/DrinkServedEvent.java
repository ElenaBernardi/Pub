package it.uniroma3.events;


public class DrinkServedEvent extends BaseEvent<String>{

    private Status state;

    public DrinkServedEvent(String id, Status state) {
        super(id);
        this.state = state;
    }
    public Status getState(){
        return this.state;
    }

}
