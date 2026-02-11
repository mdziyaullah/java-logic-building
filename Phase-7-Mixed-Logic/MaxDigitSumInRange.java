import java.util.*;
public class MaxDigitSumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int maxRange = 0;
        for(int i=start; i<=end; i++){
            int temp=i;
            int sum = 0;
            while (temp>0) {
                sum+= temp%10;
                temp=temp/10;
                
            }
            if(maxRange<sum){
                maxRange=sum;
            }
        }
        System.out.println(maxRange);
        sc.close();
    
    }
}
