package problem3;

public class NoCoinState extends AbstractState { //extending here instead of VendingState allows me to omit the methods idc about.

    private static final NoCoinState instance = new NoCoinState();
    //constructor
    private NoCoinState(){}

    //getting the instance of our state.
    public static NoCoinState getInstance(){
        return instance;
    }

    @Override
    public void insertCoin(VendingStateMachine stateMachine) {
        if(stateMachine.getNumberofBars() ==0){
            System.out.println("NO COIN Sorry, we are out...");
            return;
        }
        //use setter to update the private field that is coin count
        System.out.println("One coin inserted...");
        stateMachine.setNumberCoins(1);
        stateMachine.setCurrentState(OneCoinState.getInstance()); //inserting one coin where there were none moves us to this state.
    }

}