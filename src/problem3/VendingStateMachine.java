package problem3;


public class VendingStateMachine {

    //this is what our test class is going to be working with
    //delegating the behaviour to Test class
    //
    // instance variables
    private int numberOfBars;
    private int numberOfCoins;
    private VendingState currentState; //not VendingStateMachine

    //constructor; creating a Vending machine object
    public VendingStateMachine(int numberOfBars) {
        //initializing the vending machine
        this.numberOfBars = numberOfBars;
        this.currentState = NoCoinState.getInstance();
        numberOfCoins = 0;
    }

    //because each state has its own way of implementing this method, we will delegate it to them.
    void insertCoin(){
        this.currentState.insertCoin(this);
    }

    void refill(int numofBars){
        this.currentState.refill(this, numofBars);
    }

    void pressButton(){
        this.currentState.pressButton(this);
    }


    //do i need setters and getters here?
    //yes so you can update coins and bars
    //private fields need setters and getters.

    //getters
    int getNumberofBars(){
        return numberOfBars;
    }

    int getNumberCoins(){
        return numberOfCoins;
    }

    void setNumberofBars(int newBars){
        this.numberOfBars = newBars;
    }

    void setNumberCoins(int coins){
        this.numberOfCoins = coins;
    }

    void setCurrentState(VendingState newState){
        this.currentState = newState;
    }


}
