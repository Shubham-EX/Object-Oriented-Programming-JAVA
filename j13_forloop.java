/* 
for loop
    -syntax
    for(initialization;condition;increment/decrement){
        //code
    }

 */
import java.util.Scanner;

public class j13_forloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A: ");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i%2==0) {
                System.out.println(+i+" is even");
            }
            
        }
        

        
    }
    
}
