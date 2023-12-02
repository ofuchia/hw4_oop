package problem1;

public class TestFlowerBouquet {

	public static void main(String[] args) {
		//test case 1: rose, paper wrapping, card
		FlowerBouquet bouquet1 = new Rose();
		bouquet1 = new PaperWrapDecorator(bouquet1);
		bouquet1 = new CardDecorator(bouquet1);
		System.out.println(bouquet1.getDescription() + "$" + bouquet1.getCost());
		System.out.println("-----------------------------------");

		//test case 2: rose, double paper wrap, glitter
		FlowerBouquet bouquet2 = new Rose();
		bouquet2 = new PaperWrapDecorator(bouquet2);
		bouquet2 = new PaperWrapDecorator(bouquet2);
		bouquet2 = new GlitterDecorator(bouquet2);
		System.out.println(bouquet2.getDescription() + "$" + bouquet2.getCost());
		System.out.println("-----------------------------------");

		//test case 3: basic daisy
		FlowerBouquet bouquet3 = new Daisy();
		System.out.println(bouquet3.getDescription() + " $" + bouquet3.getCost());
	}

}
