// Problem: Reverse a Number
// Input: 1234
// Output: 4321
// Loop Used: While(n>0)
// Time Complexity: O(Digits)

import java.util.*;

class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int rev =0;

        while ((n>0)) {
            int digit= n%10;
            rev=rev*10+digit;
            n=n/10;

            
        }
        System.out.println(rev);
        sc.close();
    }
}