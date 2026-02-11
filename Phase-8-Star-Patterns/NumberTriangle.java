// Problem: Print number triangle pattern
// Input: n (number of rows)
// Pattern:
// 1
// 1 2
// 1 2 3
// Time Complexity: O(n^2)
import java.util.*;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

        System.out.println();
        }
        sc.close();
    }
}
