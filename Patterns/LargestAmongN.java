package PatternJ;

import java.util.Scanner;

public class LargestAmongN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check largest among them -> ");
        System.out.print("How many numbers you want to enter -> ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter" + (i + 1) + "th number");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is ->" + largest);
    }
}
