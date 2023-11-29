package problem1;

public class Daisy extends FlowerBouquet{
    //this is the same as my interface. at the end of the day, its gotta be implemented
    String description = "Daisy Bouquet";
    double cost = 15;

    protected volatile FlowerBouquet aBouquet;
    protected Daisy(FlowerBouquet aBouquet){
        this.aBouquet = aBouquet;
    }
    public String getDescription() {
        return this.description; //or should this be aBouquet?
    }

    public double getCost() {
        //get cost by summing up the price of the bouquet and all the decorations associated.
        //maybe advance forloop? or will I get use the getters from each decorator class and pass in a flowerBouquet object and do +=?
        return cost;
    }
}