// Problem: Sum of squares of first n natural numbers
// Example: n = 4 -> 1^2 + 2^2 + 3^2 + 4^2 = 30
// Loop Used: for
// Time Complexity: O(n)
import java.util.*;
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i*i;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
