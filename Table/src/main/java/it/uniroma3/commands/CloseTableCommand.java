package it.uniroma3.commands;

public class CloseTableCommand extends BaseCommand<String> {
    private String id;
    private Boolean isOpen;

    public CloseTableCommand(String id) {
        super(id);
        this.isOpen = false;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
}
