import java.util.Scanner;

public class IceOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberBags = input.nextInt();
        input.nextLine();
        String name = input.nextLine();
        double cash = input.nextDouble();
        
        final double BAG_COST = 35;
        final double BAG_WEIGHT = 2.5;
        final int COOLER = 4;
        
        int iceWeight = (int) (numberBags * BAG_WEIGHT);
        int fullCoolers = numberBags / COOLER;
        int extraBags = numberBags % COOLER;
        double totalCost = BAG_COST * numberBags;
        double change = cash - totalCost;
        boolean exactPayment = totalCost == cash;
        
        System.out.println("Buyer: " + name);
        System.out.println("Bags: " + numberBags);
        System.out.printf("Ice Weight: %d kg %n", iceWeight);
        System.out.println("Full Coolers: " + fullCoolers);
        System.out.println("Extra Bags: " + extraBags);
        System.out.printf("Total Cost: P%.2f%n", totalCost);
        System.out.printf("Cash: P%.2f%n", cash);
        System.out.printf("Change: P%.2f%n", change);
        System.out.println("Exact Payment: " + exactPayment);
    }
}
