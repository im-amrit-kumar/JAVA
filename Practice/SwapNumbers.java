
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers to swap (a b): ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("Before swap: a = " + a + ", b = " + b);

        long temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
        sc.close();
    }
}
