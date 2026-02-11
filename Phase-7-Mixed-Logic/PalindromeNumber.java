// Problem: Check whether a number is Palindrom
// Example: 121 -> Palindrom
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0; 
        while(temp>0){
            int digit = temp%10;
            rev=rev*10+digit;
            temp = temp/10;
        }
        if(rev==n){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
        sc.close();
    }
}
