// Problem: Print Fabonacci Series upto n term
// Input: 7
// Output: 0 1 1 2 3 5 8
// Loop Used: For
//Time Complexity: O(n)
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
        sc.close();

    }
}
