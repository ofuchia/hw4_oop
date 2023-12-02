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

        //bars and decrement coin and bar count bc everything's all good.
        System.out.println("Buy button pressed...start dispensing");
        stateMachine.setNumberofBars(stateMachine.getNumberofBars()-1);
        stateMachine.setNumberCoins(0);
        stateMachine.setCurrentState(NoCoinState.getInstance());


        //need to check on bars to figure out where to go next.
        if(stateMachine.getNumberofBars() == 0){
            //there's no need to print here.
            //System.out.println(" TWO STATE Sorry, we are out...");
            stateMachine.setCurrentState(NoChocoState.getInstance());
        }



    }



}
