// october 20, 2026 | big task
import java.util.Scanner;

public class WaterRefill{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int containers = input.nextInt();
        input.nextLine();
        String name = input.nextLine();
        double cash = input.nextDouble();
        
        final int CONTAINERS_PER_TRIP = 6;
        final double LITERS_PER_CONTAINER = 18.9;
        final double REFILL_PRICE = 25;
        int waterDelivered = (int) (containers * LITERS_PER_CONTAINER);
        int fullTrips = containers / CONTAINERS_PER_TRIP;
        int extraContainers = containers % CONTAINERS_PER_TRIP;
        double total = containers * REFILL_PRICE;
        double change = cash - total;
        boolean exactPayment = cash == total;
        
        System.out.printf("Customer: %s%n", name);
        System.out.printf("Containers: %d%n", containers);
        System.out.printf("Water Delivered: %d liters%n", waterDelivered);
        System.out.printf("Full Trips: %d%n", fullTrips);
        System.out.printf("Extra Containers: %d%n", extraContainers); 
        System.out.printf("Total Cost: P%.2f%n", total);
        System.out.printf("Cash: P%.2f%n", cash);
        System.out.printf("Change: P%.2f%n", change);
        System.out.printf("Exact Payment: %b%n", exactPayment);
    }
}
