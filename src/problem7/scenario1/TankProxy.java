package problem7.scenario1;

public class TankProxy implements Moveable {
    private Tank aTank = new Tank();


    @Override
    public void move() {
        long startTime = System.currentTimeMillis();    //start time
        aTank.move();
        long endTime = System.currentTimeMillis();      //end time

        long elapsedTime = endTime - startTime; //elapsed time

        System.out.println("The execution time is " + elapsedTime + " miliseconds.");

    }


    }
