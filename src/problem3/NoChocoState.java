package problem3;

public class NoChocoState extends AbstractState {

    private static final NoChocoState instance = new NoChocoState();

    //constructor
    private NoChocoState(){}

    //getting the instance of our this state.
    public static NoChocoState getInstance(){
        return instance;
    }

    public void pressButton(VendingStateMachine stateMachine){
        System.out.println("Sorry, WE ARE OUT.");
    }
    public void refill(VendingStateMachine stateMachine, int newBars) {
        //update bar count
        stateMachine.setNumberofBars(newBars);
        //update state
        stateMachine.setCurrentState(NoCoinState.getInstance());
    }

    @Override
    public void insertCoin(VendingStateMachine stateMachine) {
        System.out.println("Sorry, we are OUTTT.");
    }
}
