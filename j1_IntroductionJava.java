//java is class based high level object orriented programming language 
//by james gosling
//write once run anywhere

//synax 

public class j1_IntroductionJava {
    public static void main(String[] args) {
        System.out.println("\nHello World!");
        System.out.println("My name is Shubham");
    }
}

//Feature of JAVA
/* 
Note: this point also use in "why java is populer" question 

1. Simple
    -removeing pointers concept in java
2. Object Oriented
3. Portable
4. Platform Independent
5. Secured
6. Robust(strong)
7.Dynamic
8.MultiThreaded
9.Architecture Neutral
10.Interpreted
11.High Performance
12.Distributed
 */

 /* 
What is JDK , JRE ,JVM ?

(JDK -> JRE -> JVM)

JDK : 
    -java devlopment kit
    -provide tools to devlponing java application

JRE :
    -java runtime enviorment
    -provide enviorment to run java application

JVM :
    -java virtual machine
    -interprets and execute java bytecode

  */

  /* 
   What is bytecode in java?
   -Java bytecode is a low-level representation of Java source code that is platform-independent and designed to be executed by the Java Virtual Machine (JVM).
   */

/* 
instance of operator
    - test whether the oject is an instance of the specified type.
    - if yes show true , no Show False

 public class IntroductionJava {
    public static void main(String[] args) {
        IntroductionJava a = new IntroductionJava();
        System.out.println(a instanceof IntroductionJava);
    }
    
}
 */

 /* 
  Tokens
    - is the smallest elements of a program that is identified by compiler
    - every java statements and expressions are creates using token

    Types:
    1.Keywords
        - predefined reserved words
        - void,int,float...

    2.Identifier
        -class Name , method name , variable name given by programmer
        - a, sum , num..

    3.Operator
        -Operation symbols
        - +,-,*,/
    
    4.Separators
        -devide and arranging the code
        -{},(),[]

    5.Liteals 
        -storee the value
        - int a=10;

  */