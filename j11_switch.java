
/* 
 Swich case
    -syntax
    switch(expression){
        case value1:
            //code
            break;
        case value2:
            //code
            break;
        case value3:
            //code
            break;
        default:
            //code
    }

    Definition:
        - if expression is equal to value1 then execute the code inside the case value1 block
        - if expression is equal to value2 then execute the code inside the case value2 block
        - if expression is equal to value3 then execute the code inside the case value3 block
        - if expression is not equal to any case value then execute the code inside the default block

 */

import java.util.Scanner;

public class j11_switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Weekday num (1-7) :");
        int day = sc.nextInt();

        switch (day) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saterday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
