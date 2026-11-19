// october 13, 2026 | format
public class Format{
    public static void main(String[] args) {
        String name = "Mount Apo";
        int height = 2954;
        double feet = height * 3.28084;
        
        System.out.printf("Mountain: %s%n", name);
        System.out.printf("Height: %d meters %n", height);
        System.out.printf("Height in feet: %.2f%n", feet);
    }
}
