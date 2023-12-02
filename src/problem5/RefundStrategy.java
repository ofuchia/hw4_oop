package problem5;

import java.util.List;

public class RefundStrategy implements DiscountStrategy{
    //get shopping cart object, and apply refund if applicable
    ShoppingCart aCart;

    @Override
    public void applyDiscount(List<CartItem> aCart) {
        //iterate through every item in the cart, getting its price with a loop
        int counter = 0;
        double totalCost = 0;
        while(counter < aCart.size()){
            totalCost += aCart.get(counter).getPrice() * aCart.get(counter).getNumber();
            counter++;
        }
        //refund 100 if >= 500
        if(totalCost >= 500.0){
            //print discounted result
           totalCost = totalCost - 100.0;
            System.out.println(totalCost);
        }


    }
}
