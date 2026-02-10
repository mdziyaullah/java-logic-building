// Problem: Sum of factorial series
// Example: n = 4 -> 1! + 2! + 3! + 4! = 33
// Loop Used: for
// Time Complexity: O(n)
import java.util.*;
public class FactorialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfFact =0;
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
            sumOfFact+=fact;
            
        }
        System.out.println(sumOfFact);
        sc.close();
    }
    
}
