//Problem: Find The Largest Number Until 0 is Entered
//Example Input: 5 12 3 9 0 
//Output: 12
//Time Complexity: O(n)  


import java.util.*;
public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int Largest= Integer.MIN_VALUE;
        do{
            n= sc.nextInt();
            if(n>Largest && n!=0){
                Largest=n;
            }
        }
        while(n!=0);
        System.out.println(Largest);
        sc.close();
        
    }
}
