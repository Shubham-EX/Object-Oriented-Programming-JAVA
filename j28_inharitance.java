/* 
    Inharitance
    - when we construct a new class[subclass] from existing class[super class] in such a way that the new class access all the
        features and properties of existing class called inharitance
    -provide reusability
    -using extend kayword
    -super class: existing class
    -sub class: new class
    - we can note access private member from super class
    -method overriding posible

    types of inharitance
    -single
    -multilevel
    -hierarchical
    -multiple

 */


class A{

       void add(int x){
        System.out.println("addition :" + (x+10));
    }
}

class B extends A{
    
    void disp(){
        System.out.println("display");
    }
}

class B1 extends A{
    void mul(int x){
        System.out.println("multiplication :" + (x*10));
    }
}

class C extends B{
    void sub(int x){
        System.out.println("subtraction :" + (x-10));
    }
}


public class j28_inharitance {
    public static void main(String[] args) {
        
        A a = new B();
        a.add(20);

        A b = new C();
        b.add(20);

        B1 c = new B1();
        c.mul(2);


    }
    
}
