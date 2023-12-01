package problem3;

public interface VendingState {
    State getName();

    //transitions
    void insertCoin(VendingStateMachine stateMachine);
    void refill(VendingStateMachine stateMachine);
    void pressButton(VendingStateMachine stateMachine);



}
