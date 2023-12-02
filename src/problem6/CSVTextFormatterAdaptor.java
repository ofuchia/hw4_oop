package problem6;

import com.bing.CSVTextFormatter;

public class CSVTextFormatterAdaptor implements Formatter{

    //private field containing what is to be wrapped
    CSVTextFormatter adaptee;

    //Adaptor constructor; takes in the object to be wrapped, the adaptee
    CSVTextFormatterAdaptor(CSVTextFormatter adaptee){
        this.adaptee = adaptee;
    }

    //implementing the abstract method
    //work delegating to the CSVFormatter, the library one.
    //adaptor pretends to be Formatter-complient and can actually use the deliminator from the library
    public String formatText(String s){
        return adaptee.formatCSVText(s);
    }

}
