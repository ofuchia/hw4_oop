package problem3;

public class TestVendingMachine {
    public static void main(String[] args) {
        VendingStateMachine vendingMachine = new VendingStateMachine(2);
        vendingMachine.insertCoin();    //one coin inserted
        vendingMachine.pressButton();   //pls insert one more coin
        vendingMachine.insertCoin();    //two coins inserted
        vendingMachine.pressButton();   //button pressed, start dispensing

        System.out.println("paragrpah break.");

        vendingMachine.insertCoin();    //one coin inserted
        vendingMachine.insertCoin();    //two coins inserted
        vendingMachine.pressButton();   //buy button pressed

        System.out.println("break.");

        vendingMachine.insertCoin();    //sorry we out
        vendingMachine.insertCoin();    //srry
        vendingMachine.pressButton();   //ssry

        System.out.println("last break");

        vendingMachine.refill(5);
        vendingMachine.insertCoin();       // one coin inserted
        vendingMachine.insertCoin();    //two coins inserted
        vendingMachine.pressButton();   //button pressed, start dispensing.
    }
}