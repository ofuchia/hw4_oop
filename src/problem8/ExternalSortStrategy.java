package problem8;


public class ExternalSortStrategy implements SortStrategy{


    //if (fileSize < 10 * GB)
    @Override
    public void sortFile(String filePath) {
        externalSort(filePath);

    }

    public void externalSort(String filePath){
        System.out.println("External sorting");
    }
}
