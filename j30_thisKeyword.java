/* 
    This Keyword
    -this is a reference variable that refers to the current object
    -this can be used to refer current class instance variable.
    -this can be passed as an argument in the method call.
 */

class A{
    int a = 10;
    A(){
        
        System.out.println("Hello");
    }
    A(int a){
        this();

        this.a=a;       
        System.out.println(a);
    }
}
public class j30_thisKeyword {
    public static void main(String[] args) {
        A obj = new A(100);

    }
}
