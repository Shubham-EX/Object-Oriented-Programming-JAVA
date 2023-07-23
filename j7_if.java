/* 
 if condition
    -syntax
    if(condition){
        //code
    }

    - definition:
        - if condition is true then execute the code inside the if block
        - if condition is false then skip the code inside the if block
     
 */

import java.util.Scanner;

public class j7_if {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A: ");
        int a = sc.nextInt();
        System.out.println("Enter the B: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        }

        System.out.println("a is lessthan b");
    }
    
}
