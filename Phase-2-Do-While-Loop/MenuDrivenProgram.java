//Problem: Menu-Driven program using do-while
//Operations: Add, Substract, Multiply 
//Loop Used: do-while
//Time Complexity: O(n)

import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Choice;
        int a,b;
        
        do{
            System.out.println("--------MENU1-------\n 1. Add two numbers\n 2. Substract two numbers \n 3. Multiply two numbers\n 4. Exit\n Enter Your Choice");

            Choice = sc.nextInt();
            if(Choice==1){
                System.out.println("Enter Valu Of a");
                a= sc.nextInt();
                System.out.println("Enter Valu Of b");
                b= sc.nextInt();
                System.out.println("Sum = " + (a+b));

            }
            else if(Choice==2){
                System.out.println("Enter Valu Of a");
                a= sc.nextInt();
                System.out.println("Enter Valu Of b");
                b= sc.nextInt();
                System.out.println("Difference = " + (a-b));

            }
            else if(Choice==3){
                System.out.println("Enter Valu Of a");
                a= sc.nextInt();
                System.out.println("Enter Valu Of b");
                b= sc.nextInt();
                System.out.println("Product = " + (a*b));
            }
            else if(Choice==0){
                System.out.println("Exiting program");

            }

            else{
                System.out.println("Invalid Choice");
            }

        }
        while(Choice!=0);
        sc.close();
    }
    
}
