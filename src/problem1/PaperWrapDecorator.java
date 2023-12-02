package problem1;

public class PaperWrapDecorator extends BouquetDecorator{

    public PaperWrapDecorator(FlowerBouquet bouquet){
        this.bouquet = bouquet;
    }

    public String getDescription() {
        return bouquet.getDescription() + " Paper wrap ...";
    }
    public double getCost(){
        return bouquet.getCost() + 5.00;
    }

}
