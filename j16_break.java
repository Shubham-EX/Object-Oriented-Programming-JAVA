/* 
    Break
    -syntex
    break;

    Definition:
        - break is used to terminate the loop
        - break is used to terminate the switch case
        - break is used only inside the loop
        - break is used only with for loop and while loop

 */

import java.util.Scanner;

public class j16_break {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A: ");
        int a = sc.nextInt();

        for (int i = a; i >= 0; i--) {
            
                System.out.println(i);
                break;
        }

        System.out.println("no");
    }    
}
