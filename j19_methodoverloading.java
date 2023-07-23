/* 
    Method Overloading

    - Method overloading is a feature that allows us to have more than one method with the same name,
        so long as we use different parameters.
    - Method overloading is a feature that allows a class to have more than one method having the same name,
        if their argument lists are different.
    - It is similar to constructor overloading in Java, that allows a class to have more than one constructor
        having different argument lists.
    
    method overloading syntax example
    public class Addition {
        public int add(int a, int b){
            return a+b;
        }
        public int add(int a, int b, int c){
            return a+b+c;
        }
    }


 */


import java.util.Scanner;

public class j19_methodoverloading {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(add());
        System.out.println(add(12,13));
        System.out.println(add(12,12.5));
        System.out.println(add(12,13,14));


    }    

    static int add(){
        return 1+2;
    }

    static int add(int a , int b){
        return a+b;
    }

    static double add(int a , double b){
        return a+b;
    }

    static int add(int a , int b , int c){
        return a+b+c;
    }

}
