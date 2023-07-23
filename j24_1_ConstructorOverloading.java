/* 
    Constructor Overloading
    definition:
    as like in mathod over loading , same name but different parameter 

 */
class A{
    int a;
    String b;

    A(){ //default constructor
        a=10;
        b="Shubham";
        
        System.out.println(a+" as "+b);
    }

    A(int a){
        int x=a*10;
        System.out.println(x);

    }

    A(int x, String y){ //parameterized constructor
        a=x;
        b=y;
        System.out.println(x+" as "+y);
    }
}
public class j24_1_ConstructorOverloading {
    public static void main(String[] args) {
        
        A r1 = new A();
        A r2 = new A(2);
        A r3 = new A(10,"Shubham");
    }
    
}
