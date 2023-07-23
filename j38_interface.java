/* 
    * InterfaceInterface in Java
    An interface in Java is a blueprint of a class. It has static constants and abstract methods.
    The interface in Java is a mechanism to achieve abstraction
    There can be only abstract methods in the Java interface, not method body.
    "implements " to achive interface
    It is used to achieve abstraction and multiple inheritance in Java.
    
 */
interface clint {
    void input();
    void output();
}
class Shubham implements clint {
    public void input(){
        System.out.println("input");
    }
    public void output(){
        System.out.println("output");
    }
}
public class j38_interface {

    public static void main(String[] args) {
        clint s = new Shubham();
        s.input(); s.output();
    }
    
}
