/* 
 * While loop
    - entery control loop
    - syntax
    while(condition){
        //code
    }

    Definition:
        - while condition is true then execute the code inside the while block
        - while condition is false then skip the code inside the while block
 */
import java.util.Scanner;

public class j12_whileloop {
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the A: ");
            int a = sc.nextInt();
    
           /*  while (a>0) {
                System.out.println(+a+" is positive");
                a--;
            } */

            int i = 0;
            while (i<=a) {
                if (i%2==0) {
                    System.out.println(+i+" is even");
                }
                i++;
                
            }
    }    
}
