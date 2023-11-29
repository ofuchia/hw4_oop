package problem1;

public class Rose extends FlowerBouquet{
    //this is the same as my interface. at the end of the day, its gotta be implemented
    String description = "Rose Bouquet";
    double cost = 20;

    protected volatile FlowerBouquet aBouquet;
    protected Rose(FlowerBouquet aBouquet){
        this.aBouquet = aBouquet;
    }
    public String getDescription() {

        return description;
    }

    public double getCost() {
        return cost;
    }
}
