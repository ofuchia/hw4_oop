package problem8;
import java.io.File;

public class QuickSortStrategy implements SortStrategy{
    File file;
    //if (fileSize < 6 * GB)
    public void sortFile(String filePath){
        quickSort(filePath);
    }

    public void quickSort(String filePath){
        System.out.println("Quick sorting.");
    }
}
