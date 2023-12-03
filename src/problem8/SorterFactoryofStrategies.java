package problem8;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class SorterFactoryofStrategies { //Factory of Strategies
    private static final Map<String, SortStrategy> cachedStrategies = new HashMap<>();
    private static final long GB = 1000 * 1000 * 1000;

    //inputting into Maps
    static {
        cachedStrategies.put("lessThan6", new QuickSortStrategy());
        cachedStrategies.put("lessThan10", new ExternalSortStrategy());
        cachedStrategies.put("lessThan100", new ConcurrentExternalStrategy());
        cachedStrategies.put("greaterThan100", new MapReduceSortStrategy());
    }

    public static SortStrategy getSorterStrategy(String type) {
        File file = new File(type);
        long fileSize = file.length();
        if(fileSize < 6 * GB){
            return cachedStrategies.get("lessThan6");
        }
        else if(fileSize < 10 * GB){
            return cachedStrategies.get("lessThan10");
        }
        else if(fileSize < 100 * GB){
            return cachedStrategies.get("lessThan100");
        }
        else{
            return cachedStrategies.get("greaterThan100");
        }

    }
}
