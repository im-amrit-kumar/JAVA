
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long max = Math.max(a, Math.max(b, c));
        System.out.println("Greatest = " + max);
        sc.close();
    }
}
