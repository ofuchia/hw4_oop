package problem1;

public class BalloonDecorator extends BouquetDecorator{

    public BalloonDecorator(FlowerBouquet bouquet){
        this.bouquet = bouquet;
    }

    public String getDescription() {
        return bouquet.getDescription() + " Balloon ...";
    }
    public double getCost(){
        return bouquet.getCost() + 7.00;
    }

}
