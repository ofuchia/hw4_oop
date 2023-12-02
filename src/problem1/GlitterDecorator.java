package problem1;

import java.util.concurrent.Flow;

public class GlitterDecorator extends BouquetDecorator{

    //constructor. gives it the object to be decorated
    public GlitterDecorator(FlowerBouquet bouquet){
        this.bouquet = bouquet;
    }

    //adding glitter to the current description of the FlowerBouquet object
    public String getDescription() {
        return bouquet.getDescription() + "Glitter ...";
    }

    //appending cost to already existing one
    @Override
    public double getCost() {
        return bouquet.getCost() + 8.00;
    }
}
