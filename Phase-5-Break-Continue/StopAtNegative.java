// Problem: Keep taking numbers until a negative number is entered
// Loop Used: while + break
// Time Complexity: O(n)
import java.util.*;
public class StopAtNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
           int n=sc.nextInt();
            if(n<0){
                break;
            }
            System.out.print(n+" ");
        }
        
        
        sc.close();
    
    }
}
