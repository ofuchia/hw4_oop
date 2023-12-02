package problem6;

import com.bing.CSVTextFormatter;

public class TestFormatter {

	public static void main(String[] args) {

		Formatter formatter = new NewLineFormatter();

		System.out.println(formatter.formatText("Bing.is.a.good.man."));

		// now switch to the vender's comma formatter

		//creating an obj of the CSVFormatter class
		CSVTextFormatter csvObject = new CSVTextFormatter();
		//updating the formatter variable
		formatter = new CSVTextFormatterAdaptor(csvObject);




		// end of your code
		System.out.println(formatter.formatText("Bing.is.a.good.man.")); // this line should print comma separated text

	}

}
