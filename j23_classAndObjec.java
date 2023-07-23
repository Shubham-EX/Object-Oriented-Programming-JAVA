/* 
    Class
        Definition
            - A class is a blueprint for the object. We can think of class as an sketch of a parrot with labels. 
            It contains all the details about the name, colors, size etc. Based on these descriptions, we can study about the parrot. 
            Here, a class is like a blueprint or a template for the object.
            - syntax
                class <class_name>{
                    //body
                }
            -Type
                1. Pre defined
                    - String,Scanner,Math...
                2. User defined
                    - Student,Employee,Car...
            
    Object
        Definition
        An instance of an existing class that can be created using new keyword in Java programming language.
        
        Syntax
            <class_name> <object_name> = new <class_name>();

    New Key word:
        - The new keyword is used to allocate memory for object at runtime. All objects get memory in Heap memory area.
        - The new keyword is also used to invoke constructor of a class.

        */


/* class A{    //class
    int a = 10;
    String b="Shubham";

    void show(){
        System.out.println(+a+ "" +b);

    }
}

public class j23_classAndObjec {
    public static void main(String[] args) {
        
        A obj = new A();  //object 
        obj.show();
    }
    
}
 */

 // P|1

import java.util.Scanner;

class Rectangle{ //class
    int hight;
    int width;

    public void area()
    {
        int area = hight*width;
        System.out.println("Area of Rectangle is : "+area);
    }
}

public class j23_classAndObjec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(); //object

        System.out.println(" Hight:");
        r.hight = sc.nextInt();
        System.out.println("\n Width: ");
        r.width = sc.nextInt();

        r.area();
        


    }

    
}