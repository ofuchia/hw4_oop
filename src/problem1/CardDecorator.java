package problem1;

public class CardDecorator extends BouquetDecorator{

    //constructor
    public CardDecorator(FlowerBouquet bouquet){
        this.bouquet = bouquet;
    }

    public String getDescription() {
        return bouquet.getDescription() + " Card ...";
    }
    public double getCost(){
        return bouquet.getCost() + 6.00;
    }
}
