import java.util.Scanner;

public class TripBudget{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("");
        String name = input.nextLine();
        System.out.print("");
        int numberPeople = input.nextInt();
        System.out.print("");
        int totalTravel = input.nextInt();
        System.out.print("");
        double budget = input.nextDouble();
        
        final double BOAT_FARE = 60;
        final double ENTRANCE_FEE = 150;
        final double COTTAGE_COST = 1500;
        
        double totalBoat = BOAT_FARE * numberPeople;
        double totalEntrance = ENTRANCE_FEE * numberPeople;
        double totalTotal = totalBoat + totalEntrance + COTTAGE_COST;
        double perPerson = ((BOAT_FARE + ENTRANCE_FEE) + (COTTAGE_COST / numberPeople));
        
        int hour = totalTravel / 60;
        int minute = totalTravel % 60;
        
        boolean withinBudget = budget >= perPerson;
        
        System.out.println("Day Trip to \"Island Garden City\" ");
        System.out.printf("Leader: %s%n", name);
        System.out.printf("Group Size: %d%n", numberPeople);
        
        System.out.printf("%-14s", "Item");
        System.out.printf("%14s%n", "Amount (P)");
        System.out.printf("%-14s%12.2f%n","Boat Fare", totalBoat);
        System.out.printf("%-14s%12.2f%n","Entrance Fee", totalEntrance);
        System.out.printf("%-14s%12.2f%n","Cottage", COTTAGE_COST);
        System.out.printf("%-14s%12.2f%n","Total", totalTotal);
        System.out.printf("%-14s%12.2f%n","Per Person", perPerson);
        System.out.println("Travel Time: " + hour + " hr " + minute + " min");
        System.out.printf("Within Budget: %b", withinBudget);
    }
}
