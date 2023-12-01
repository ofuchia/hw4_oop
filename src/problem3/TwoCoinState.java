package problem3;

public class TwoCoinState implements VendingState{

    //creating object of the class
    private static final TwoCoinState instance = new TwoCoinState();
    private TwoCoinState(){}

    //getting the instance of our state.
    public static TwoCoinState getInstance(){
        return instance;
    }
    public State getName(){return State.CONTAINSTWOCOINSSTATE;}

    @Override
    public void insertCoin(VendingStateMachine vendingMachine) {
        vendingMachine.setCurrentState(TwoCoinState.getInstance()); //inserting one coin where there were none moves us to this state.
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
