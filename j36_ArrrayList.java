/* 
    ArrayList:
    Java ArrayList class uses a dynamic array for storing the elements.
    It is like an array, but there is no size limit. We can add or remove elements anytime.
    it is much more flexible than the traditional array.
    Java ArrayList class can contain duplicate elements.
    Java ArrayList class maintains insertion order.
    Java ArrayList class is non synchronized.
    Java ArrayList allows random access because the array works on an index basis.It is found in the java.util package

    ArrayList<Integer> al = new ArrayList<Integer>(); 

    Methods of ArrayList:
    1. add()
    2. addAll()
    3. get()
    4. set()
    5. remove()
    6. removeAll()
 */

import java.util.ArrayList;

public class j36_ArrrayList {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        
        System.out.println(al);
        al.add(1, 100);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.removeAll(al);
        System.out.println(al);
    }
    
}
