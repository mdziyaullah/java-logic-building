// Problem: Find sum of digits of a number. 
// Input: 1234
// Output: 10
// Loop Used: While(n>0)
// Time Complexity: O(Digits)

import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum =0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
