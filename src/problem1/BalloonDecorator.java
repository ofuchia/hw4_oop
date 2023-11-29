package problem1;

public class BalloonDecorator extends FlowerBouquet{

    double cost = 7;
    String description = "Balloon";

    protected volatile FlowerBouquet aBouquet;
    protected BalloonDecorator(FlowerBouquet aBouquet){
        this.aBouquet = aBouquet;
    }
    public String getDescription() {
        return this.description; //or should this be aBouquet?
    }

}
