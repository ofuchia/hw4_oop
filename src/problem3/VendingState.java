package problem3;

public interface VendingState {

    //transitions to be overridden by other states.
    void insertCoin(VendingStateMachine stateMachine);
    void refill(VendingStateMachine stateMachine, int numOfBars);
    void pressButton(VendingStateMachine stateMachine);
    //void dispense(VendingStateMachine stateMachine);

}
