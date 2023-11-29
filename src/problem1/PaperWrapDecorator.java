package problem1;

public class PaperWrapDecorator extends FlowerBouquet{

    double cost = 5;
    String description = "Paper wrap";

    protected volatile FlowerBouquet aBouquet;
    protected PaperWrapDecorator(FlowerBouquet aBouquet){
        this.aBouquet = aBouquet;
    }
    public String getDescription() {
        return this.description; //or should this be aBouquet?
    }

}
