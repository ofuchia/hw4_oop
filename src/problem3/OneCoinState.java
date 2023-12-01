package problem3;

package problem3;

public class OneCoinState implements VendingState {

    private static final OneCoinState instance = new OneCoinState();
    private OneCoinState(){}

    //getting the instance of our state.
    public static OneCoinState getInstance(){
        return instance;
    }
    //getting the stateName
    public State getName(){return State.CONTAINSONECOINSTATE;}


    //overriding the transitions
    @Override
    public void insertCoin(VendingStateMachine vendingMachine) {
        //if there are zero bars, set it to the no chocolate bar state
        if(VendingStateMachine.getNumberofBars() == 0){
            stateMachine.setCurrentState(NoChocoState.getInstance());
        }
        //
        //updating the state
        vendingMachine.setCurrentState(OneCoinState.getInstance()); //inserting one coin where there were none moves us to this state.
        //update the coin coin
    }

    @Override
    public void pressButton(VendingStateMachine stateMachine) {
        //something happens
        //updating candy bar count
        //saying out of bars
        //decreasing coin count
    }

    @Override
    public void refill(VendingStateMachine stateMachine) {
        //something happens.
    }
}