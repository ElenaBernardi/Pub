package it.uniroma3.commands;

import it.uniroma3.aggregates.Status;

public class PrepareFoodCommand extends BaseCommand<String>{
    private String id;
    private Status state;

    public PrepareFoodCommand(String id) {
        super(id);
        this.state = Status.FOOD_TO_SERVE;
    }

    public String getId() {
        return id;
    }

    public Status getState() {
        return state;
    }
}
