package problem5;
import java.util.*;

public class TenOffStrategy implements DiscountStrategy{
    //get shopping cart object, and apply 10% off there
    ShoppingCart aCart;

    @Override
   public void applyDiscount(List<CartItem> aCart) {
        //how do we getPrice() from here? if we only have items in the cart, not the cart itself?
        //iterate through every item in the cart, getting its price with an advanced for loop?
       int  counter = 0;
       double totalCost = 0;
       while(counter < aCart.size()){
           totalCost += aCart.get(counter).getPrice() * aCart.get(counter).getNumber();
           counter++;
       }
       //calculate 10% off
        double finalCost = totalCost - (totalCost * 0.10);
        //print final result
        System.out.println(finalCost);
       }


    }
