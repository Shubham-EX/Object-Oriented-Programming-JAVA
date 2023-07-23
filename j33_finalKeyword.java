/* 
    * Final Keyword
    Final keyword can be used with class, method and variable.
    definition:
    The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
    1. variable
        - If you make any variable as final, you cannot change the value of final variable(It will be constant).
    2. method
        - If you make any method as final, you cannot override it.
    3. class
        - If you make any class as final, you cannot extend it.

 */
/* //1
public class j33_finalKeyword {
    public static void main(String[] args) {

        final int i = 10;
        System.out.println(i);
        // i = 20; // error
        //System.out.println(i);

    }
    
} */

final class test{ //final class
    void mNum(){
        System.out.println("0987654321");
    }
    final void mpin(){ //final method
        System.out.println("4321");
    }
}
class thaif extends test{
    @Override
    void mNum(){
        System.out.println("0987654321");
    }
    @Override
    void mpin(){ ///error
        System.out.println("4321");
    }
}

public class j33_finalKeyword {
    public static void main(String[] args) {

        thaif t = new thaif();
        t.mNum(); t.mpin();
               

    }
    
}
