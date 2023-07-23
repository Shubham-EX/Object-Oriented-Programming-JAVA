
/* 
    Constructor
    - Constructor is a special type of method which is used to initialize the object.
    - Constructor name must be same as class name.
    - Constructor does not have return type.
    - Constructor is called automatically when object is created.
    - Constructor is used to initialize the object.
    - Constructor is used to allocate memory to the object.

        syntax of constructor with class
        class <class_name>{

            <class_name>(){
                //body
            }
        }
    Type:
        1. Default constructor
            - If we do not create any constructor in class then compiler will create a default constructor.
            - Default constructor is created by compiler.
            - Default constructor does not have any parameter.
            - Default constructor is used to initialize the object with default values.
            - Default constructor is called automatically when object is created.
            - Default constructor is used to allocate memory to the object.
        
        2. Parameterized constructor
            - If we create any constructor in class then compiler will not create a default constructor.
            - Parameterized constructor is created by programmer.
            - Parameterized constructor have parameter.
            - Parameterized constructor is used to initialize the object with user defined values.
            - Parameterized constructor is called automatically when object is created.
            - Parameterized constructor is used to allocate memory to the object.
        
        3. Copy constructor
            - Copy constructor is used to copy the values of one object into another object.
            - Copy constructor is created by programmer.
            - Copy constructor have parameter.
            - Copy constructor is used to initialize the object with user defined values.
            - Copy constructor is called automatically when object is created.
            - Copy constructor is used to allocate memory to the object.
        
        4. Private constructor
            - Private constructor is used to restrict the object creation.
            - not access by other class
            - Private constructor is created by programmer.
            - Private constructor have parameter.
            - Private constructor is used to initialize the object with user defined values.
            - Private constructor is called automatically when object is created.
            - Private constructor is used to allocate memory to the object.
        

        
 */
class A{
    int a;
    String b;

    A(){ //default constructor
        a=10;
        b="Shubham";
    }
    A(int x, String y){ //parameterized constructor
        a=x;
        b=y;
    }
    A(A ref){ //copy constructor
        a=ref.a;
        b=ref.b;
    }
    private A(int x){ //private constructor
        a=x;
    }

    void show(){
        System.out.println(+a+ "" +b);
    }
}
public class j24_Constructor {

    public static void main(String[] args) {
        A r1 = new A(); //default constructor  //A( ) is constructore
        r1.show();

        A r2 = new A(12,"Shubham"); //parameterized constructor
        r2.show();

        A r3 = new A(r2); //copy constructor
        r3.show();

       // A r4 = new A(12); //private constructor not accessable for thi sclass it can only use in same class
       // r4.show();
    }

    
}

/* 
    Constuctor Overloading
    definition:
    as like in mathod over loading , same name but different parameter as above example

    


 */

