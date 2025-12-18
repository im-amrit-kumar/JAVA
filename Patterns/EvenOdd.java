// package PatternJ;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a numbe to check It is even / odd-> ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("The numbe is even  ");
        }else{
            System.out.println("The number is odd ");
        }
    }
}
