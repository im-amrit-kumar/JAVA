
import java.util.Scanner;

public class AreaTriangleHeron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides a b c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sides must be positive.");
            sc.close();
            return;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle sides.");
            sc.close();
            return;
        }
        double s = (a + b + c) / 2.0;
        double areaSq = s * (s - a) * (s - b) * (s - c);
        if (areaSq < 0) areaSq = 0; // guard for FP rounding
        double area = Math.sqrt(areaSq);
        System.out.printf("Area (Heron) = %.6f%n", area);
        sc.close();
    }
}
