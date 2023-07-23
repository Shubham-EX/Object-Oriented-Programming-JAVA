public class j4_typecasting {
    public static void main(String[] args) {
        int a=10;
        double b= a; // implicit typecasting
        System.out.println(b);

        double c= 10.5;
        int d = (int)c; // explicit typecasting
        System.out.println(d);
    }
}

/* 
 implicit typecastig
    - done by compiler
    - lower datatype to higher datatype
    - no data loss
    - int to double
    - winding byte -> short -> int -> float -> Double 

    explicit typecasting
    - done by programmer
    - higher datatype to lower datatype
    - data loss
    - double to int
    - narrowing Double -> float -> int -> short -> byte
    
 */
