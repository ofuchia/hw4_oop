package problem8;


public class SortingTool {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        String filePath = "test.txt";

        //fileSize < 6 --> quickSort
        sorter.setStrategy(new QuickSortStrategy());
        sorter.sortFile(filePath); // args[0] stores the file path irl but its a string for testing purposes

        //fileSize < 10 --> externalSort
        sorter.setStrategy(new ExternalSortStrategy());
        sorter.sortFile(filePath);

        //fileSize < 100 --> concurrentExternalSort
        sorter.setStrategy(new ConcurrentExternalStrategy());
        sorter.sortFile(filePath);

        //fileSize 100+ --> mapreduceSort
        sorter.setStrategy(new MapReduceSortStrategy());
        sorter.sortFile(filePath);


    }
}
