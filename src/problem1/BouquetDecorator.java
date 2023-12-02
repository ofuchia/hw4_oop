package problem1;

public abstract class BouquetDecorator extends FlowerBouquet{
    FlowerBouquet bouquet;  //the object to be wrapped (any type of flower)
    public abstract String getDescription(); //each decorator has to implement their own
}
