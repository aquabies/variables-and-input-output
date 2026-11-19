// october 14, 2026 | bmi checker
import java.util.Scanner;

public class BMICheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("");
        String name = input.nextLine();
        System.out.print("");
        double weight = input.nextDouble();
        System.out.print("");
        double height = input.nextDouble();
        
        double meterHeight = height / 100;
        double BMI = weight / (meterHeight * meterHeight);
        
        final double LOWEST_NORMAL = 18.5;
        final double OVERWEIGHT = 25.0;
        boolean normal = (BMI >= LOWEST_NORMAL) && (BMI < OVERWEIGHT);
        
        System.out.printf("Name: %s%n", name);
        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.printf("Height: %.2f m%n", meterHeight);
        System.out.printf("BMI: %.2f%n", BMI);
        System.out.printf("Normal BMI: %b%n", normal);
    }
}
