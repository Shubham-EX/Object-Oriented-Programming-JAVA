/* 
 if else condition
    - syntax
    if(condition){
        //code
    }
    else{
        //code
    }
    
    definition
        - if condition is true then execute the code inside the if block
        - if condition is false then execute the code inside the else block
  
 */
import java.util.Scanner;

public class j8_ifeles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A: ");
        int a = sc.nextInt();

        if (a>0) {
            System.out.println("a is positive");
        
        } else {
            System.out.println("A is zero or Negative");
        }

    }
    
}
