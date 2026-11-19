// october 14, 2026 | organization shirt order
import java.util.Scanner;

public class OrganizationShirtOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        input.nextLine(); 
        System.out.print("Buyer: ");
        String buyer = input.nextLine();
        System.out.print("Size: ");
        char size = input.next().charAt(0);
        System.out.print("Pay: ");
        double paid = input.nextDouble();
        
        double cost = 285;
        int packsFive = quantity / 5;
        int looseShirts = quantity % 5;
        double total = quantity * cost;
        double balance = total - paid;
        int percentPaid = (int) ((paid * 100) / total);
        boolean fullyPaid = paid >= total;
        
        System.out.printf("Buyer: %s%n", buyer);
        System.out.printf("Size: %c%n", size);
        System.out.printf("Shirts: %d%n", quantity);
        System.out.printf("Packs of 5: %d%n", packsFive);
        System.out.printf("Loose Shirts: %d%n", looseShirts);
        System.out.printf("Total Cost: P%.2f%n", total);
        System.out.printf("Amount Paid: P%.2f%n", paid);
        System.out.printf("Balance: P%.2f%n", balance);
        System.out.printf("Percent Paid: %d%%%n", percentPaid);
        System.out.printf("Fully Paid: %b%n", fullyPaid);
    }
}
