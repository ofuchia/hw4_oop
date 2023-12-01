package problem4;

import java.math.BigDecimal;

public class TestAuction {
    public static void main(String[] args) {


        Product prod1 = new Product("iPhone 12", new BigDecimal(999));
        Bidder sanchez = new Bidder("Sanchez");
        Bidder wei = new Bidder("Wei");
        Bidder scherger = new Bidder("Scherger");


        sanchez.subscribes(prod1);
        wei.subscribes(prod1);
        scherger.subscribes(prod1);


        //sanchez bidder
        //(Product product, BigDecimal biddingPrice){
        sanchez.placeBid(prod1, new BigDecimal("1200"));
        scherger.placeBid(prod1, new BigDecimal("1250"));
    }
}