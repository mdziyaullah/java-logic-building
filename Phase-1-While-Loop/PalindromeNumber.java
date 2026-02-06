// Problem: Check whether the given number is a palindrome
// Input: 121
// Output: 121
// Loop Used: While(n>0)
// Time Complexity: O(Digits)/ O(logn)


import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int Original = n;
        int Reverse =0;
        while ((n>0)) {
            int digit = n%10;
            Reverse = Reverse*10+digit;
            n=n/10;
            
        }
        if(Reverse==Original){
            System.out.println("Number is PalindromeNumber");
            
        }
        else{
            System.out.println("Number is Not a PalindromNumber");
        }
        sc.close();
    }
}
