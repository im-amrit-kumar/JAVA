
import java.util.Scanner;

public class CurrencyConverter {
    private static final double DEFAULT_USD_TO_INR = 83.0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) USD to INR");
        System.out.println("2) INR to USD");
        System.out.print("Choose (1/2): ");
        int choice = sc.nextInt();

        System.out.print("Enter exchange rate (INR per 1 USD) or 0 to use default (" + DEFAULT_USD_TO_INR + "): ");
        double rate = sc.nextDouble();
        if (rate <= 0) rate = DEFAULT_USD_TO_INR;

        if (choice == 1) {
            System.out.print("Enter amount in USD: ");
            double usd = sc.nextDouble();
            System.out.printf("INR = %.2f%n", usd * rate);
        } else if (choice == 2) {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();
            System.out.printf("USD = %.6f%n", inr / rate);
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
