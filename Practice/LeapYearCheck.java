
import java.util.Scanner;

public class LeapYearCheck {
    private static boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (e.g., 2024): ");
        int year = sc.nextInt();
        System.out.println(isLeap(year) ? "Leap year" : "Not a leap year");
        sc.close();
    }
}
