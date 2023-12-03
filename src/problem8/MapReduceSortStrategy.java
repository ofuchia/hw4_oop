package problem8;
import java.io.File;

public class MapReduceSortStrategy implements SortStrategy{
    File file;
    @Override
    public void sortFile(String filePath) {
        mapreduceSort(filePath);
    }

    public void mapreduceSort(String filePath){
        System.out.println("Map reduce sorting.");
    }
}
