/* 
    if else if else condition
        -syntax
        if(condition){
            //code
        }
        else if(condition){
            //code
        }
        else{
            //code
        }

        - Definition
            - if condition is true then execute the code inside the if block
            - if condition is false then execute the code inside the else if block
            - if condition is false then execute the code inside the else block
 */

import java.util.Scanner;

public class j9_ifelseifelse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("A:");
        int a = sc.nextInt();

        if (a>0) {
            System.out.println("a is Positiv");
            
        } 
        else if(a==0)
        {
            System.out.println(" A is zero");

        }
        else
        {
            System.out.println("A is Negative");
        }
    }

    
}
