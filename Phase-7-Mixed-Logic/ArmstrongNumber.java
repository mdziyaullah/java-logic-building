// Problem: Check whether a number is Armstrong
// Example: 153 -> Armstrong
// Time Complexity: O(d) where d = number of digits
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        while(temp>0){
            digits++;
            temp=temp/10;
        }
        temp=n;
        int sum = 0;
        while (temp>0) {
            int digit = temp%10;
            sum += Math.pow(digit, digits);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
