package problem8;

//the original
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;
    SortStrategy newStrategy;

    //Sorter
    Sorter() {
    }

    public void setStrategy(SortStrategy newStrategy) {
        this.newStrategy = newStrategy;
    }

    public void sortFile(String aPath) {
        newStrategy.sortFile(aPath);

    }
}
