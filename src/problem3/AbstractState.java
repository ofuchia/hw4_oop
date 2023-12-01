package problem3;

public abstract class AbstractState implements VendingState {

    public void insertCoin(VendingStateMachine stateMachine) {}
    public void refill(VendingStateMachine stateMachine, int numOfBars){}
    public void pressButton(VendingStateMachine stateMachine){}
    public void dispense(VendingStateMachine stateMachine){}
}
