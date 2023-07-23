/* 
    Abstract class in java
    -A class which is declared as abstract is known as an abstract class.
    - It can have abstract and non-abstract methods
    - It needs to be extended and its method implemented. 
    - It can have constructors and static methods also.

    abstract class A{}  


 */
abstract class A{
    void m3(){
        System.out.println("m3");
    }
}
class B extends A{
    void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}


public class j37_abstactClass {
    public static void main(String[] args) {
            
        /* A b = new A();
            b.m3() */
           
            B b = new B();
            b.m1(); b.m2(); b.m3(); // use only with making sub class of abstact class
    }
    
}
