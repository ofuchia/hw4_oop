package problem8;


public class SortingTool {

    public static void main(String[] args) {

        //getting the proper Strategy
        SortStrategy sorterObj = SorterFactoryofStrategies.getSorterStrategy(args[0]);  //programming to an interface so that's the type
        //doing the proper sort
        sorterObj.sortFile(args[0]);

    }
}
