/* 
    Array methods
    - length
    - sort
    - binarySearch
    - toString
    - copyOf
    - copyOfRange
    - fill
    - equals
    - asList



 */
import java.util.Arrays;
import java.util.Scanner;

public class j21_ArrayMethods {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nenter the legnth of Array: ");
            int n = sc.nextInt();

            int[] a = new int[n];

            for(int i=0 ; i<a.length ; i++){
                a[i] = sc.nextInt();

            }
            //sort
            /* Arrays.sort(a);    
            for(int i=0 ; i<a.length ; i++){
                System.out.print("Sorted array is :  "+a[i]);
            }
             */
            //copy
            int[] b = Arrays.copyOf(a, a.length);
            System.out.println("new array is : ");
            for(int i=0 ; i<b.length ; i++){
                System.out.print(" "+b[i]);
            }
    }    
}
