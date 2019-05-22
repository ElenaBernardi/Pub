package it.uniroma3.commands;

public class CreateOrderCommand extends BaseCommand<String> {

    private String id;
    private Long tableNumber;
    private String waiter;
    private Boolean isOpen;

    public CreateOrderCommand(String id, Long tableNumber, String waiter) {
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

    public Boolean getOpen() {
        return isOpen;
    }
}
