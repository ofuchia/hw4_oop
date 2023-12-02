package problem5;

import java.util.Arrays;
import java.util.List;

public class TestShoppingCart {
    public static void main(String[] args) {
        List<CartItem> list = Arrays.asList(
                new CartItem("iPhone 10", 1, 40),
                new CartItem("Vizio TV", 2, 500),
                new CartItem("Tesla", 1, 50)
        );
        ShoppingCart shoppingCart = new ShoppingCart(list);
        // write your code here for strategy 1
        shoppingCart.setStrategy(new TenOffStrategy());


        // end of your code
        shoppingCart.checkout(); //to run the actual discount method

        // write your code here for strategy 2

        shoppingCart.setStrategy(new RefundStrategy());

        // end of your code
        shoppingCart.checkout();

        // write your code here for strategy 3
        shoppingCart.setStrategy(new EchoStrategy());

        // end of your code
        shoppingCart.checkout();
    }
}
