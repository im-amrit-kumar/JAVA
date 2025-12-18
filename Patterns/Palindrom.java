package PatternJ;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check it is palindorm or not - ");
        String s = sc.nextLine();
        String rev = "";

        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }
    }
}
