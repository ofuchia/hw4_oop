package problem4;

import java.math.BigDecimal;

public class Bidder{
    String bidderName;

    public Bidder(String bidderName) {
        this.bidderName = bidderName;
    }

    public String getBidderName() {
        return bidderName;
    }


    @Override
    public String toString() {
        return bidderName;
    }


    //bidder notified when a higher price is put down.
    //bidder subscribes to an object
    public void subscribes(Product product) {
        //adding that bidder to the Product's subscription list
        product.getSubscribers().add(this);
    }

    //removes bidder from a product's subscription
    public void unsubscribe(Product product){
        product.getSubscribers().remove(this);
    }
    public void placeBid(Product product, BigDecimal biddingPrice){
        System.out.println("-----------------New bid placed----------------");
        product.update(biddingPrice);
        //notify all subscribers
        product.notifyBidders(this, biddingPrice);
    }
    //redefining what it means for the bidders to be equal (names are the same)
    public boolean equals(Bidder secondBidder){
        return this.bidderName.equals(secondBidder.bidderName);
    }
}