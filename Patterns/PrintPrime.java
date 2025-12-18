package PatternJ;
import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number - ");
        int n = sc.nextInt(); //20

        System.out.print("Prime numbers are - ");

        for (int num = 2; num <= n; num++) {
            boolean isprime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            
            if (isprime) {
                System.out.print(num + " ");
            }
        }
    }
}