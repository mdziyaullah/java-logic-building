//Problem: Take Number Until 0 is Entered and print their sum
//Example Input: 5 10 3 0 
//Output: 18
//Time Complexity: O(n)  

import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        
        do{
            n = sc.nextInt();
            sum+=n;


        }
        while(n!=0);
        System.out.println(sum);
        sc.close();
        
    }
    
}
