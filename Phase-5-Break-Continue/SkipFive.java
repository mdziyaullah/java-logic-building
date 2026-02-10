// Problem: Print numbers from 1 to 10, skip 5
// Loop Used: for + continue
public class SkipFive {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i+ "  ");
        }
        
    }
}
