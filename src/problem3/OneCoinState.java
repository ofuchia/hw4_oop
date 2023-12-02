package problem3;

public class OneCoinState extends AbstractState {

    private static final OneCoinState instance = new OneCoinState();
    private OneCoinState(){}

    //getting the instance of our state.
    public static OneCoinState getInstance(){
        return instance;
    }

    //overriding the transitions
    @Override
    public void insertCoin(VendingStateMachine stateMachine) {
        //if there are zero bars, set it to the no chocolate bar state
        if(stateMachine.getNumberofBars() == 0){
            System.out.println("Sorry, we are out...");
            return;
        }
        //adding another coin takes us to two coin state.
        if(stateMachine.getNumberCoins()==1){
            System.out.println("Two coins inserted...please press Buy button...");
            stateMachine.setCurrentState(TwoCoinState.getInstance());
            return;
        }
        //otherwise, increase the coin count and move the states
        System.out.println("One coin inserted...");
        stateMachine.setNumberCoins(1);
        stateMachine.setCurrentState(TwoCoinState.getInstance());
    }

    @Override
    public void pressButton(VendingStateMachine stateMachine) {
        //lacking one coin
        System.out.println("Please insert one more coin...");
    }

    public void refill(VendingStateMachine stateMachine) {
        //not a valid transition. Delete after confirming with testing.
    }
}