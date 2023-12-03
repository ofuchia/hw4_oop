package problem8;
import java.io.File;

public class ConcurrentExternalStrategy implements SortStrategy{
    File file;

    @Override
    public void sortFile(String filePath) {
        concurrentExternalSort(filePath);
    }

    public void concurrentExternalSort(String filePath){
        System.out.println("Concurrent external sorting.");
    }
}
