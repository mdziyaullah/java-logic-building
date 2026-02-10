// Problem: Sum positives, skip 0, stop at negative
// Loop Used: while + break + continue
// Time Complexity: O(n)
import java.util.*;
public class SumSkipZeroStopNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if(n<0){
                break;
            }
            else if (n==0){
                continue;
            }
            sum+=n;
           }
            System.out.print(sum+" ");
        sc.close();
        
    }
    
}
