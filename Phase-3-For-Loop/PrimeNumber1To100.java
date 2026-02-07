// Problem: Print all prime numbers between 1 and 100
// Loop Used: for (nested)
// Time Complexity: O(n^2) (basic approach)
public class PrimeNumber1To100 {
    public static void main(String[] args) {

    for(int num=2; num<=100; num++){
        boolean isPrime=true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
        System.out.print(num+" ");
    }
    }
    
    
    

    
}
}
