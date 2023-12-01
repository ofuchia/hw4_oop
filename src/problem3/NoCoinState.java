package problem3;

public class NoCoinState implements VendingState {

    private static final NoCoinState instance = new NoCoinState();
    private NoCoinState(){}

    //getting the instance of our state.
    public static NoCoinState getInstance(){
        return instance;
    }
    public State getName(){return State.NOCOINSTATE;}

    @Override
    public void insertCoin(VendingStateMachine vendingMachine) {
        vendingMachine.setCurrentState(OneCoinState.getInstance()); //inserting one coin where there were none moves us to this state.
    }

    @Override
    public void pressButton(VendingStateMachine stateMachine) {
        //something happens

    }

    @Override
    public void refill(VendingStateMachine stateMachine) {
        //something happens.
    }
}