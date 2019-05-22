package it.uniroma3.dto.commands;

public class CreateOrderDTO {
    private Long tableNumber;
    private String waiter;

    public Long getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Long tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }
}
