package problem5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();
    DiscountStrategy strategy;

    //constructor to allow context to accept strategy
    public ShoppingCart(List<CartItem> items, DiscountStrategy strategy) {
        this.items = items;
        this.strategy = strategy;
    }



    public void setStrategy(DiscountStrategy newStrategy){
        this.strategy = newStrategy;
    }

    public void checkout() {
        strategy.applyDiscount(this);
    }
}
