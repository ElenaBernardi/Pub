package it.uniroma3.events;


public class FoodOrderedEvent extends BaseEvent<String> {

    private String productId;
    private Boolean isDrink;
    private Long price;
    private Status state;

    public FoodOrderedEvent(String lineItemId, String productId, Boolean isDrink, Long price, Status state) {
        super(lineItemId);
        this.productId = productId;
        this.isDrink = isDrink;
        this.price = price;
        this.state = state;
    }

    public String getProductId() {
        return productId;
    }

    public Boolean getIsDrink() {
        return isDrink;
    }

    public Long getPrice() {
        return price;
    }

    public Status getState() {
        return state;
    }
}
