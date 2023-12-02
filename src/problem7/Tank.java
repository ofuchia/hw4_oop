package problem7;

import java.util.Random;

public class Tank implements Moveable{
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


    public static void main(String[] args) {
        Moveable tankProxyObj = new TankProxy();    //program to interface??

        tankProxyObj.move();
    }
}
