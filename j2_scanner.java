import java.util.Scanner;

public class j2_scanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // use for user imput with java.util.Scanner package

        System.out.println("Hello enter Your name");
        String name = sc.nextLine();
        
        System.out.println(" Your name is "+name+ " Nice to meet you " +name);
    }
    
}
