import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {
    private final Queue<RegistrarParking> parkingQueue = new LinkedList<>();

    public synchronized void addCar(RegistrarParking car) {
        parkingQueue.add(car);
        notify(); // notify a waiting agent
    }

    public synchronized RegistrarParking getCar() throws InterruptedException {
        while (parkingQueue.isEmpty()) {
            wait(); // wait for cars
        }
        return parkingQueue.poll();
    }
}
