// Problem: Print all possible pairs (i, j) from 1 to n
// Input: n = 3
// Loop Used: Nested for loop
// Time Complexity: O(n^2)

import java.util.Scanner;

public class AllPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("("+i + "," + j+")");
                
            }
            System.out.println();
           
        }
        
        sc.close();
    }
    
}
