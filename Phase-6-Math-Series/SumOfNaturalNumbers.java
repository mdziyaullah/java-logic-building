// Problem: Sum of first n natural numbers
// Example: n = 5 → 1+2+3+4+5 = 15
// Loop Used: for
// Time Complexity: O(n)
import java.util.*;
class SumOfNaturalNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            
            sum+=i;


        }
        System.out.println(sum);
        sc.close();
    }
}