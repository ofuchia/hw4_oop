package problem7.scenario1;

import problem7.scenario1.Moveable;
import problem7.scenario1.TankProxy;

import java.util.Random;

public class Tank implements Moveable {
    @Override
    public void move() {
        //start time
        System.out.println("Tank moving...");
        // code to invoke some fancy graphics interface, it may be time consuming
        try {
            Thread.sleep(new Random().nextInt(10000)); // simulating the executing of some time consuming graphics interface
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //end time
    }


    //testing

    public static void main(String[] args) {
        Moveable tankProxyObj = new TankProxy();        //programming to an interface means the interface is the Type

        tankProxyObj.move();
    }
}
