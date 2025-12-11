
import java.util.Scanner;

public class TemperatureConverter {
    private static double fToC(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
    private static double cToF(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Fahrenheit to Celsius");
        System.out.println("2) Celsius to Fahrenheit");
        System.out.print("Choose (1/2): ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.printf("Celsius = %.6f%n", fToC(f));
        } else if (choice == 2) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.printf("Fahrenheit = %.6f%n", cToF(c));
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
