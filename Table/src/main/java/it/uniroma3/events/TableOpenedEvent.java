package it.uniroma3.events;

public class TableOpenedEvent extends BaseEvent<String>{
    private String id;
    private Long tableNumber;
    private String waiter;
    private Boolean isOpen;

    public TableOpenedEvent(String id, Long tableNumber, String waiter, Boolean isOpen) {
        super(id);
        this.tableNumber = tableNumber;
        this.waiter = waiter;
        this.isOpen = true;
    }

    public String getId() {
        return id;
    }

    public Long getTableNumber() {
        return tableNumber;
    }

    public String getWaiter() {
        return waiter;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
}
