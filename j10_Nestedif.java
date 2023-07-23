/* 
    Nested if
    -syntax
    if(condition){
        //code
        if(condition){
            //code
        }
    }

    definition
        - if condition is true then execute the code inside the if block
        - if condition is true then execute the code inside the nested if block
 */
import java.util.Scanner;

public class j10_Nestedif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A: ");
        int a = sc.nextInt();

        if (a>0) {
            System.out.println("a is positive");
            if (a%2==0) {
                System.out.println("a is even");
            }
        } else {
            System.out.println("A is zero or Negative");
        }
    }
}
