
import java.util.Scanner;

public class AreaTriangleBaseHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        if (base < 0 || height < 0) {
            System.out.println("Base and height must be non-negative.");
            sc.close();
            return;
        }
        double area = 0.5 * base * height;
        System.out.printf("Area = %.6f%n", area);
        sc.close();
    }
}
