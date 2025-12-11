import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers separated by space: ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("Sum = " + (a + b));
        sc.close();
    }
}
