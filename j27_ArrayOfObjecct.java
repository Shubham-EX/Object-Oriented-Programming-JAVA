/* 
    Array of object
    - we can also create an array of objects just like we create an array of primitive type.


 */
class student{
    int rollno;
    String name;

    student(int r, String n) {
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }

}

public class j27_ArrayOfObjecct {
    public static void main(String[] args) {
        
        student[] s = new student[2];
        s[0] = new student(111, "Karan");
        s[1] = new student(222, "Aryan");
        
        for(int i=0; i<s.length; i++){
            s[i].display();
        }
        
    }
    
}
