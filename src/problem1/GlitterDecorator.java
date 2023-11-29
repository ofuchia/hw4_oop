package problem1;

public class GlitterDecorator extends FlowerBouquet{
    double cost = 8;
    String description = "Glitter";

    protected volatile FlowerBouquet aBouquet;
    protected GlitterDecorator(FlowerBouquet aBouquet){
        this.aBouquet = aBouquet;
    }
    public String getDescription() {
        return this.description; //or should this be aBouquet?
    }
}
