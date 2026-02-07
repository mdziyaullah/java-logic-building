// Problem: Check Whether a number is prime 
// Input: 7
// Output: prime
// Loop Used: For
//Time Complexity: O(n)

import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         while (true) {
            System.out.print("Enter a number (negative to exit): ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Program terminated.");
                break;
            }

        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

       
    }
    sc.close();
    
}
}
