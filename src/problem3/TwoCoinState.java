package problem3;

public class TwoCoinState extends AbstractState{

    //creating object of the class
    private static final TwoCoinState instance = new TwoCoinState();
    //constructor
    private TwoCoinState(){}

    //getting the instance of our state.
    public static TwoCoinState getInstance(){
        return instance;
    }


    @Override
    public void pressButton(VendingStateMachine stateMachine) { //problem is here.
        //check has to happen after dispensing, because we will never be at TwoCoin and without bars.

        //bars and decrement coin and bar count bc everythings all good.
        System.out.println("Buy button pressed...start dispensing");
        stateMachine.setNumberofBars(stateMachine.getNumberofBars()-1);
        stateMachine.setCurrentState(NoCoinState.getInstance());
        //do i return here?

        //need to check on bars to figure out where to go next. ..but autp dispensing a bar means we're in a no coin state.
        if(stateMachine.getNumberofBars() == 0){
            System.out.println(" TWO STATE Sorry, we are out...");
            stateMachine.setCurrentState(NoChocoState.getInstance());
            return;
        }

        stateMachine.setCurrentState(NoCoinState.getInstance());

    }



}
