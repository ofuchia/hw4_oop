package problem8;

public class ConcurrentExternalStrategy implements SortStrategy{

    @Override
    public void sortFile(String filePath) {
        concurrentExternalSort(filePath);
    }

    public void concurrentExternalSort(String filePath){
        System.out.println("Concurrent external sorting.");
    }
}
