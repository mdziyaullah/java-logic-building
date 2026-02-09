// Problem: Count factors of every number from 1 to n
// Input: n = 5
// Output: factor count for each number
// Loop Used: Nested for loop
// Time Complexity: O(n^2)
import java.util.*;
public class CountFactorsTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count+=1;
                    
                } 
            }
            System.out.println(i+"->"+count);
        }
        
        
        sc.close();
    }
    
}
