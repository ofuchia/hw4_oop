package problem5;

import java.util.List;

public class EchoStrategy implements DiscountStrategy{
    //if total is >= 300, give away echo dot.
    ShoppingCart aCart;

    @Override
    public void applyDiscount(List<CartItem> aCart) {
        //how do we getPrice() from here? if we only have items in the cart, not the cart itself?
        //iterate through every item in the cart, getting its price with an advanced for loop?
        int counter = 0;
        double totalCost = 0;
        while(counter < aCart.size()){
            totalCost += aCart.get(counter).getPrice() * aCart.get(counter).getNumber();
            counter++;
        }
        //give away Echo if it meets the price
        if(totalCost >= 300.0){
            //print discounted result
            System.out.println("Add a free Amazon Echo Dot in shopping cart");
            System.out.println(totalCost);
        }


    }
}
