/* 
 passing objects to methods
    - we can pass the object of a class as an argument in the method.
    - in such case, we have to pass only object reference.
    - let's see the simple example of passing object as an argument in java.

 */
class Student{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}


public class j26_passObjectToMethod {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.insertRecord(111, "Karan"); // pasing the objects
        s2.insertRecord(222, "Aryan");
        
        s1.displayInformation();
        s2.displayInformation();
    }
}
