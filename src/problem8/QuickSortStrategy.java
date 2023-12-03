package problem8;

public class QuickSortStrategy implements SortStrategy{

    //if (fileSize < 6 * GB)
    public void sortFile(String filePath){
        quickSort(filePath);
    }

    public void quickSort(String filePath){
        System.out.println("Quick sorting.");
    }
}
