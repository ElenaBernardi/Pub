package it.uniroma3.commands;

public class CloseTableCommand extends BaseCommand<String> {
    private Boolean isOpen;

    public CloseTableCommand(String id) {
        super(id);
        this.isOpen = false;
    }


    public Boolean getIsOpen() {
        return isOpen;
    }
}
