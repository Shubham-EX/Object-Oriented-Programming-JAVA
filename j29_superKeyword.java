/* 
    Super Keyword
        Definition:
        The super keyword is used to refer the parent or superclass of a subclass in Java. 
    - whenever the super class and sub class variable and methods both are same than it cas use.
    - avoid confusio.
    - other wise it select sub class veriable and methods

 */

class A{
    int a = 10;

    void show(){
        System.out.println("Hello");
    }

}

class B extends A{
    int a = 30;
    void dis(){
        System.out.println(a);
        System.out.println(super.a); // derect to super class variable
    }
    void show(){
        super.show();   // derect to superclass method
        System.out.println("show");
    }
}

public class j29_superKeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.dis();
        obj.show();

    }
    
}
