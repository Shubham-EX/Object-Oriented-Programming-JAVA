/* 
    Mathematical functions

    Definition;
        - Mathematical functions are used to perform mathematical operations
        - Mathematical functions are used to perform mathematical operations on the given input
        - Mathematical functions are used to perform mathematical operations on the given input and return the result
    Package:
        - java.lang.Math
    
    Mathematical Functions:
    1. math.abs()
        - math.abs() is used to return the absolute value of the given input
        - math.abs() is used to return the positive value of the given input
        - math.abs() is used to return the magnitude of the given input
      
    2. math.max()
        - math.max() is used to return the maximum value of the given two inputs
        - math.max() is used to return the largest value of the given two inputs
        - math.max() is used to return the highest value of the given two inputs
    
    3. math.min()
        - math.min() is used to return the minimum value of the given two inputs
        - math.min() is used to return the smallest value of the given two inputs
        - math.min() is used to return the lowest value of the given two inputs
    
    4. math.pow()
        -use
            - math.pow() is used to return the power of the given input

    5. math.sqrt()
        - math.sqrt() is used to return the square root of the given input
    
    6. math.round()
        - math.round() is used to return the rounded value of the given input
        - math.round() is used to return the nearest integer of the given input
        - math.round() is used to return the nearest whole number of the given input
    
    7. math.random()
        -use
            - math.random() is used to return the random value of the given input
            - math.random() is used to return the random value between 0.0 to 1.0
            
 */
//wap using any  methametical functions.

import java.util.Scanner;
import java.lang.Math;


public class j17_MathFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("A: ");
        int a = sc.nextInt();

        double c = Math.PI * Math.pow(a,2);

        System.out.println("C is : " +c );


        
    }

    
}

