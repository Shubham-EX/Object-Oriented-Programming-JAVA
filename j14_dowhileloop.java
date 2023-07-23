/* 
    Do While loop
    -syntax
    do{
        //code
    }while(condition);

    definition:
        - do while loop is same as while loop
        - but the difference is do while loop execute the code inside the do block atleast once
        - while loop execute the code inside the while block only if the condition is true
 */

import java.util.Scanner;   

public class j14_dowhileloop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A: ");
        int a = sc.nextInt();

        do {
            System.out.println(+a+" is positive");
            a--;
        } while (a>0);
    }    
}
