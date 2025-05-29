import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ParkingPool pool = new ParkingPool();

        // Create Parking Agents
        new ParkingAgent("Agent-1", pool).start();
        new ParkingAgent("Agent-2", pool).start();
        new ParkingAgent("Agent-3", pool).start();

        Scanner scanner = new Scanner(System.in);
        int carCount = 0;

        // Simulate cars arriving
        while (carCount < 10) {
            System.out.println("Press Enter to register a car for parking (or type 'exit' to stop):");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) break;

            RegistrarParking car = new RegistrarParking();
            pool.addCar(car);
            carCount++;
        }

        scanner.close();
        System.out.println("Parking registration closed.");
    }
}
