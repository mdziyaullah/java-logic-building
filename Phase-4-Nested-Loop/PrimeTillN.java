// Problem: Print all prime numbers from 1 to n
// Input: n = 10
// Output: 2 3 5 7
// Loop Used: Nested for loop
// Time Complexity: O(n^2)
import java.util.*;
public class PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=2; i<=n; i++){
            boolean isPrime = true; 
           for(int j=2; j<i; j++){
            if(i%j==0){
                isPrime=false;
                break;
            }         
           }
           if(isPrime){
            System.out.println(i);
           }
        }
        sc.close();
       
            
        
    }
    
}
