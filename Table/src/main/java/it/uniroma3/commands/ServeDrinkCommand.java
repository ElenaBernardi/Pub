package it.uniroma3.commands;

import it.uniroma3.aggregates.Status;

public class ServeDrinkCommand extends BaseCommand<String>{
    private String id;
    private Status state;

    public ServeDrinkCommand(String id) {
        super(id);
        this.state = Status.SERVED;
    }

    public String getId() {
        return id;
    }

    public Status getState() {
        return state;
    }
}
