// october 21, 2026
import java.util.Scanner;

public class WeeklyAllowance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double weekly = input.nextDouble();
        
        final int SCHOOL_DAYS = 5;
        double daily = weekly / SCHOOL_DAYS;
        
        System.out.println("Name: " + name);
        System.out.printf("Weekly Allowance: P%.2f%n", weekly);
        System.out.printf("Daily Allowance: P%.2f%n", daily);
        
        input.close();
    }
}
