// october 21, 2026 
import java.util.Scanner;

public class PrintJob{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pages = input.nextInt();
        input.nextLine();
        String name = input.nextLine();
        char size = input.next().charAt(0);
        double cash = input.nextDouble();
        
        final double PRINT_COST = 2.5;
        final int PAGES_PER_MINUTE = 18;
        
        int sheets = (int) (pages / 2 + pages % 2);
        int min = (int) (pages / PAGES_PER_MINUTE);
        int sec = (int) (pages * 60) / PAGES_PER_MINUTE;
        double total = PRINT_COST * pages;
        double change = cash - total;
        boolean exactPayment = total == cash;
        
        System.out.println("Customer: \"" + name + "\"");
        System.out.println("Paper: " + size);
        System.out.println("Pages: " + pages);
        System.out.println("Sheets: " + sheets);
        System.out.println("Print Time: " + min + " min " + sec + " sec");
        System.out.printf("Total Cost: P%.2f%n", total);
        System.out.printf("Cash: P%.2f%n", cash);
        System.out.printf("Change: P%.2f%n", change);
        System.out.printf("Exact Payment: %b%n", exactPayment);
    }
}
