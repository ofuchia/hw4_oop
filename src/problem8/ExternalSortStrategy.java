package problem8;

import java.io.File;

public class ExternalSortStrategy implements SortStrategy{

    //taking in a file object
    File file;

    //if (fileSize < 10 * GB)
    @Override
    public void sortFile(String filePath) {
        externalSort(filePath);

    }

    public void externalSort(String filePath){
        System.out.println("External sorting");
    }
}
