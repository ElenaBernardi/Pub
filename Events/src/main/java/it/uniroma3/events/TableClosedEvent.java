package it.uniroma3.events;

public class TableClosedEvent extends BaseEvent<String>{
    private Boolean isOpen;

    public TableClosedEvent(String id, Boolean isOpen) {
        super(id);
        this.isOpen = isOpen;
    }

    public Boolean getIsOpen(){
        return this.isOpen;
    }
}
