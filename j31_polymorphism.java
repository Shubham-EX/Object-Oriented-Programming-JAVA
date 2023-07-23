/* 
Polymorphism
    - Polymorphism is the ability of an object to take on many forms.
    - The most common use of polymorphism in OOP occurs when a parent 
        class reference is used to refer to a child class object.
    type:
        - Compile time polymorphism
        - Method Overloading
            overloading mathod is in (j19_methodoverloading.class)
        - Run time polymorphism
            - Method Overriding

    Method Overriding
    -when we writing method in superclass and shub class in such a way that method name and parameter 
        must be same called method overriding

    -syntax
    class A{
        void show(){
            System.out.println("A");
        }
    }
    class B extends A{
        void show(){
            System.out.println("B");
        }
    }
 */

class A{
        void show(){ //same name and parameter method in different class
            System.out.println("A");
        }
 }
class B extends A{
        
        void show(){ //same name and parameter method in different class
            System.out.println("B");
        }
}


public class j31_polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
