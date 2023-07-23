/* 
 Continue
    - syntax
    continue;
    - definition
        - continue is used to skip the current iteration of the loop
        - continue is used only inside the loop
        - continue is used only with for loop and while loop
 */

import java.util.Scanner;

public class j15_continue {

    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the A: ");
            int a = sc.nextInt();
    
            for (int i = 0; i <= a; i++) {
                if (i%2==0) {
                    continue;
                }
                System.out.println(+i+" is odd");
            }
    }
}
