public class ParkingAgent extends Thread {
    private final ParkingPool pool;
    private final String agentName;

    public ParkingAgent(String name, ParkingPool pool) {
        this.agentName = name;
        this.pool = pool;
    }

    public void run() {
        while (true) {
            try {
                RegistrarParking car = pool.getCar();
                System.out.println(agentName + " parked car #" + car.getParkingId());
                Thread.sleep(1000); // Simulate parking time
            } catch (InterruptedException e) {
                System.out.println(agentName + " interrupted.");
                break;
            }
        }
    }
}
