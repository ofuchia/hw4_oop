package problem3;

public class NoChocoState implements VendingState{

    private static final NoChocoState instance = new NoChocoState();
    private NoChocoState(){}

    //getting the instance of our state.
    public static NoChocoState getInstance(){
        return instance;
    }
    public State getName(){return State.NOCHOCOBARSTATE;}

    @Override
    public void insertCoin(VendingStateMachine vendingMachine) { //should i take in an int too?
        vendingMachine.setCurrentState(NoChocoState.getInstance()); //inserting one coin where there were none moves us to this state.
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
