package problem7.scenario2;
import com.bing.tank.Movable;
import com.bing.tank.Tank;
import problem7.Moveable;

public class TestTank {
    public static void main(String[] args) {
        TankMetricsCollectorProxyFactory newCollector = new TankMetricsCollectorProxyFactory();
        Movable something = (Movable) newCollector.createProxy(new Tank());
        something.move();

    }
}
