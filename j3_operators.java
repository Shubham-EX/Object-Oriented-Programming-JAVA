import java.util.Scanner;


public class j3_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int z = sc.nextInt();
        int a,b,c;
       /*  b = a++;
        c = b; */
    
        a =z*12/2;
        b = a/2;
        c = 100-b;


        System.out.println("A: " + c);

    }
}

/* 
Operators
    - symbol to perform specific mathamatical and logical function

    Types:
    1.Arithmetic
        - +,-,*,/,%,++,--
    
    2.Assignment
        - =,+=,-=,*=,/=,%=
    
    3.Relational
        - ==,!=,>,<,>=,<=
    
    4.Logical
        - &&,||,!

    5.Bitwise
        - &,|,^,~,<<,>>
    
    6.Conditional
        - ?:
        - called tenory
    
    7. Increment and Decrement 
        - ++,--
        - pre and post
        - pre increment and post increment
        - pre decrement and post decrement
        
*/