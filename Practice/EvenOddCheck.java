
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
        sc.close();
    }
}
