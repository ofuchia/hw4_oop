package problem8;


public class MapReduceSortStrategy implements SortStrategy{

    //if over 100
    @Override
    public void sortFile(String filePath) {
        mapreduceSort(filePath);
    }

    public void mapreduceSort(String filePath){
        System.out.println("Map reduce sorting.");
    }
}
