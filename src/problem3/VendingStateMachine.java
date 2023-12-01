package problem3;


public class VendingStateMachine {

    //this is what our test class is going to be working with
    //delegating the behaviour to Test class
    //
    // instance variables
    private int numberOfBars;
    private int numberOfCoins;
    private VendingState currentState; //not VendingStateMachine

    //constructor
    public VendingStateMachine(int numberOfBars) {
        //initializing the vending machine
        this.numberOfBars = numberOfBars;
        this.currentState = NoCoinState.getInstance();
    }

    //increasing number of coins
    void insertCoin(int coins){
        numberOfCoins += coins;
        //does this move states?
    }

    void refill(int i){
        numberOfBars = i;
        //why does this move states?
        currentState = NoCoinState.getInstance();


    }

    void pressButton(){
        numberOfBars--;     //decrease number of candy bars
        numberOfCoins -=2; //decrememnt it by 2

    }

    //getters
    int getNumberofBars(){
       return numberOfBars;

    }

    void getNumberCoins(){

    }

    //setters
//   this is done with refilling isnt it??  void setNumberOfBars(int newBars){

}


    //getters and settersr to se
