package problem1;

public class CardDecorator extends FlowerBouquet{
    double cost = 6;
    String description = "Card";

    protected volatile FlowerBouquet aBouquet;
    protected CardDecorator(FlowerBouquet aBouquet){
        this.aBouquet = aBouquet;
    }
    public String getDescription() {
        return this.description; //or should this be aBouquet?
    }
}
