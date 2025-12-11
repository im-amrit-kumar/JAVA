import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Count must be positive.");
            sc.close();
            return;
        }
        double sum = 0.0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        System.out.printf("Average = %.6f%n", sum / n);
        sc.close();
    }
}
