
//package PatternJ;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Check it is Prime or not - ");
        int n = sc.nextInt();
        int count = 0;
        if (n >= 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("The number is not prime");
            } else {
                System.out.println("The number is prime");
            }
        } else {
            System.out.println("Enter +ve number");
        }

    }
}
