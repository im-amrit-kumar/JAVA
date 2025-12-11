
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius (non-negative): ");
        double r = sc.nextDouble();
        if (r < 0) {
            System.out.println("Radius must be non-negative.");
            sc.close();
            return;
        }
        double area = Math.PI * r * r;
        System.out.printf("Area of circle = %.6f%n", area);
        sc.close();
    }
}
