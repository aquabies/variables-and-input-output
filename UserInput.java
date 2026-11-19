import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Written Work: ");
        final double WRITTEN_WORK = input.nextDouble();
        System.out.print("Performance Task: ");
        final double PERFORMANCE_TASK = input.nextDouble();
        
        final double GRADE_BEFORE_EXAM = (WW * 0.20) + (PT * 0.50);
        final double EXAM_SCORE_NEEDED = (75 - GBE) / 0.30;
        final double HIGHEST_POSSIBLE_GRADE = (100 * 0.30) + GBE;
        
        System.out.printf("%nName: %s %n", name);
        System.out.printf("%nWritten Work: %.2f %n", WRITTEN_WORK);
        System.out.printf("%nPerformance Task: %.2f %n", PERFORMANCE_TASK);
        System.out.printf("%nGrade Before Exam: %.2f %n", GRADE_BEFORE_EXAM);
        System.out.printf("%nExam Score Needed: %.2f %n", EXAM_SCORE_NEEDED);
        System.out.printf("%nHighest Possible Grade: %.2f %n", HIGHEST_POSSIBLE_GRADE);
    }
}
