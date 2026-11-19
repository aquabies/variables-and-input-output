// october 13, 2026 | operators and type casting
public class OperatorsTypeCasting {
    public static void main(String[] args) {
        int totalSeconds = 4000;
        int hour = totalSeconds / 3600;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds % 60;
        double avg = (double) (85+90+78) / 3;
        boolean even = totalSeconds % 2 == 0;
        
        System.out.println(totalSeconds + " seconds " + "= " + hour + " hr " + minute + " min " + second + " sec");
        System.out.println("Average of 85, 90, 78 = " + avg);
        System.out.println("Is 4000 even? " + even);
    }
}
