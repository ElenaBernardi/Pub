package it.uniroma3.entities;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class OrderQueryEntity {

    @Id
    private String orderId;
    private Long tableName;
    private String waiter;
    private Boolean isOpen;
    @ElementCollection
    private List<OrderLineItem> items;
    private Long bill;
    private Long amount_paid;
    private Long tip;

    public OrderQueryEntity() {}

    public OrderQueryEntity(String orderId, Long tableName, String waiter, Boolean isOpen, List<OrderLineItem> items, Long bill, Long amount_paid, Long tip) {
        this.orderId = orderId;
        this.tableName = tableName;
        this.waiter = waiter;
        this.isOpen = isOpen;
        this.items = items;
        this.bill = bill;
        this.amount_paid = amount_paid;
        this.tip = tip;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getTableName() {
        return tableName;
    }

    public void setTableName(Long tableName) {
        this.tableName = tableName;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public List<OrderLineItem> getItems() {
        return items;
    }

    public void setItems(List<OrderLineItem> items) {
        this.items = items;
    }

    public Long getBill() {
        return bill;
    }

    public void setBill(long bill) {
        this.bill = bill;
    }

    public Long getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(Long amount_paid) {
        this.amount_paid = amount_paid;
    }

    public Long getTip() {
        return tip;
    }

    public void setTip(Long tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "OrderQueryEntity{" +
                "orderId='" + orderId + '\'' +
                ", tableName=" + tableName +
                ", waiter='" + waiter + '\'' +
                ", isOpen=" + isOpen +
                ", items=" + items +
                ", bill=" + bill +
                ", amount_paid=" + amount_paid +
                ", tip=" + tip +
                '}';
    }
}
