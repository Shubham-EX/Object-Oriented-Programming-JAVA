/* 
 Methods

    Definition:
    A method is a block of code that performs some specific task. It takes input parameters, executes
    the task and returns the output.
    
    Syntax for defining methods in Java programming language are as follows -
    <access_modifier> <return_type> <method_name>(<parameter_list>){
        //method body
    }

    Types:
    1. Pre defined
        - print(),println(),next(),nextLine()...
    2. User defined
        - sum(),sub(),mul()...


    Types of methods:
    1. Without argument without return
    2. With argument without return
    3. Without argument with return
    4. With argument with return


    Actual Parameter v/s Frormal Parameter
    - Actual Parameter : the parameter which are passed to the method during the method call
        - example :
            - sum(12,12);
            - here 12,12 are actual parameter
    - Formal Parameter : the parameter which are declared in the method definition
        - example :
            - public static void sum(int a , int b){
                //method body
            }
            - here a,b are formal parameter
 */

import java.util.Scanner;

public class j18_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        disply();
        disply(12,12);

        int a =sum();
        System.out.println(+a);

        int b = sum(13, 13);   // 13 and 13 is argument or actual parameter****
        System.out.println(+b);

        j18_methods Name = new j18_methods(); // without Static we neeed to create object
        Name.name();

    }
    public static void disply(){            //without argument without return
        System.out.println("Hello World");
    }

    public static void disply(int x, int y){       //with argument without return
        System.out.println(+(x+y));
    }
    public static int sum(){                    //without argument with return
        return 12+12;
    }
    public static int sum(int a , int b){       //with argument with return
        return a+b;
    }                                              // a and b is parameter or formal paramter


    void name(){                            // without static
        System.out.println("Shubham");
    }

}





/* 
P|1 : WAP program for fibonacci

import java.util.Scanner;

public class j18_methods {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to fibonacci : ");
        int n = sc.nextInt();

        for (int i=0 ; i <= n ; i++ ){
            System.out.println(fibonaci(i));
        }
    }   
    
    static int fibonaci(int x){
        if (x<=1) {

            return x;
            
        }
        return fibonaci(x-1)+fibonaci(x-2);
    }
}
 */