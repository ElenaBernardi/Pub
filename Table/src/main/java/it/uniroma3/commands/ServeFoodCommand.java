package it.uniroma3.commands;

import it.uniroma3.aggregates.Status;

public class ServeFoodCommand extends BaseCommand<String>{
    private String id;
    private Status state;

    public ServeFoodCommand(String id) {
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
