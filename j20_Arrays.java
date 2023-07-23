/* 
    Arrays
    - Arrays is a fixed size sequential collection of elements of same datatype 
        grouped under single variable name.
    - Arrays are used to store multiple values in a single variable, 
        instead of declaring separate variables for each value.
    - Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.
    - start from 0 to n-1

    Syntax
    datatype[] arrayName = new datatype[size];

    Types:
    1. Single Dimensional Array
         syntax
            datatype[] arrayName = new datatype[size];
    2. Multi Dimensional Array

 */
import java.util.Scanner;;

public class j20_Arrays {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            //Satic Arraye

            int[] a = new int[5];
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;

            for(int i=0 ; i<5 ; i++){
                System.out.println(a[i]);

            }

            //Dynamic Array
            System.out.println("\n\nenter the legnth of Array: ");
            int n = sc.nextInt();

            int[] b = new int[n];

            for(int i=0 ; i<n ; i++){
                b[i] = sc.nextInt();

            }
            System.out.println("printed...");
            for(int i=0 ; i<5 ; i++){
                System.out.print(" "+b[i]);

            }

        }
    
}
