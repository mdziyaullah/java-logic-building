// Problem: Print multiplication tables from 1 to 5
// Loop Used: Nested for loop
// Time Complexity: O(n^2)

public class AllTables {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i*j + " ");
            }
             System.out.println();
        }
       
    }

    
}