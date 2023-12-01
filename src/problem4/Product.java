package problem4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Product {
    private String productName;
    private BigDecimal initialPrice;
    private BigDecimal newBidPrice;
    private List<Bidder> subscribers = new ArrayList<>();


    public Product(String productName, BigDecimal initialPrice) {
        this.productName = productName;
        this.initialPrice = initialPrice;
    }
    public BigDecimal getBidPrice(){
        return this.newBidPrice;
    }
    public void setBidPrice(BigDecimal newBidPrice){
        this.newBidPrice = newBidPrice;
    }

    public List<Bidder> getSubscribers() {
        return subscribers;
    }

    //put update method in Bidder interface
    public void update(BigDecimal amount){
        this.setBidPrice(amount);
    }

    public void notifyBidders(Bidder bidder, BigDecimal amount){
        //traverse list to notify all
        for(Bidder subbies : subscribers){
            //bidder recieving message is the same one placing highest bid
            if(bidder.equals(subbies)){
                System.out.println("Hello " + subbies.bidderName+ "! New bid amount of "+ amount+" has been placed on "+productName+ " by you!");
            }
            else{
                System.out.println("Hello " + subbies.bidderName+ "! New bid amount of "+ amount+" has been placed on "+productName+ " by "+ bidder.getBidderName());
            }

        }
    }
}