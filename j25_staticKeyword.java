/* 
    Static Keyword
        Definition:
        - use for memory management 
        - We can apply static keyword with variables, methods, blocks.
        - The static keyword belongs to the class than instance of the class.

        - static variable: 
            - If we declare any variable as static, it is known as static variable.
            - The static variable can be used to refer the common property of all objects (that is not unique for each object) e.g. company name of employees,college name of students etc.
            - The static variable gets memory only once in class area at the time of class loading.
        - static method:
            - If we apply static keyword with any method, it is known as static method.
            - A static method belongs to the class rather than object of a class.
            - A static method can be invoked without the need for creating an instance of a class.
            - static method can access static data member and can change the value of it.
        - static block:
            - Is used to initialize the static data member.
            - It is executed before main method at the time of classloading.
            - static block run fist in JVM memory with .class file.
            - even befor main , but for execution its need to make main class 

 */
class a{
    static int a = 10;
    static void show(){
        System.out.println("a = "+a);
    }
    static{
        System.out.println("Static block"); //run first
    }
}

public class j25_staticKeyword {
    public static void main(String[] args) {
        a.show();

    }
    
}

/* 
    Nested Class
    - class within another class
    - Nested class is a member of its enclosing class.
    - Non-static nested classes (inner classes) have access to other members 
      of the enclosing class, even if they are declared private.
    - Static nested classes do not have access to other members of the enclosing class.
    - As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. 
      (Recall that outer classes can only be declared public or package private.)
    - Why Use Nested Classes?
        - It is a way of logically grouping classes that are only used in one place: 
          If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. 
          Nesting such "helper classes" makes their package more streamlined.
        - It increases encapsulation: 
          Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. 
          By hiding class B within class A, A's members can be declared private and B can access them. 
          In addition, B itself can be hidden from the outside world.
        - It can lead to more readable and maintainable code: 
          Nesting small classes within top-level classes places the code closer to where it is used.
     
    
    -Types of Nested Classes
        - Non-static nested classes (inner classes)
        - Static nested classes
        - Local classes
        - Anonymous classes

    




 */