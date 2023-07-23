/* 
    Dynamic Mathod Dispatch
    -----------------------
    - Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime, rather than compile time.

 */

class A{
    void show(){
        System.out.println(" classA");
    }
}
class B extends A{
    void show(){
        System.out.println(" classB");
    }
}
public class j32_DynamicMathodDispatch {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();

        obj1.show(); //output : Class A
        obj2.show(); //output : Class B
        obj3.show(); //output : Class B

        B obj4 = new A(); // bcoz A cannot acces on B , Only B can use A
        obj4.show(); //output : error

    }
    
}
