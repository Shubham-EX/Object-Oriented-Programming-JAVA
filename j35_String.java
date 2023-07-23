/* 
    String
    string is basically an object that represents sequence of char values

    There are two ways to create String object:

        By string literal
        By new keyword

    Methods
    1. length()
    2. concat()
    3. equals()
    4. compareTo()
    5. charAt()
    6. indexOf()
    7. lastIndexOf()
    8. replace()
    9. substring()
    10. toLowerCase()
    11. toUpperCase()

 */

public class j35_String {
    public static void main(String[] args) {
        // string literal
        String s1 = "Hello";
        System.out.println(s1);
        // new keyword
        String s2 = new String("Hello");
        System.out.println(s2);





        // string length
        System.out.println(s1.length());
        // string concatenation
        System.out.println(s1.concat(s2));
        // string comparison
        System.out.println(s1.equals(s2));
        //toLowerCase
        System.out.println("toLowerCase :" + s1.toLowerCase());
        
    }
    
}


/* 

    StringBuffer:
    synchronized
    StringBuffer is a peer class of String that provides much of the functionality of strings.
    String represents fixed-length, immutable character sequences while StringBuffer 
        represents growable and writable character sequences.
    
    StringBuilder:
    StringBuilder is same as StringBuffer except one difference that it is not synchronized.
    StringBuilder is fast as it is not thread-safe.
    StringBuilder is mutable that is it's length and content can be changed anytime.


 */