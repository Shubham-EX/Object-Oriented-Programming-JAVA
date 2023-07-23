/* 
    * Exception
    Exception is an abnormal condition.

    Definition:
    The Exception Handling in Java is one of the powerful mechanism to handle the runtime 
    errors so that the normal flow of the application can be maintained.

    Exception Handling is a mechanism to handle runtime errors

    types:
    1) Checked Exception
    The classes that directly inherit the Throwable class except RuntimeException and Error are 
    known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are 
    checked at compile-time.

    2) Unchecked Exception
    The classes that inherit the RuntimeException are known as unchecked exceptions.
    For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
    Unchecked exceptions are not checked at compile-time, but they are checked at runtime.


    five keywords that are used to handle the exception

    1) try
    The try keyword is used to specify a block where we should place exception code.
    The try block must be followed by either catch or finally. It means, we can't use try block alone.
    
    2) catch
    The catch block is used to handle the exception. It must be preceded by try block which means 
    we can't use catch block alone. It can be followed by finally block later.

    3) finally
    The finally block is used to execute the important code of the program. It is executed whether
    exception is handled or not.

    4) throw
    The throw keyword is used to throw an exception.

    5) throws
    The throws keyword is used to declare exceptions. It doesn't throw an exception. It specifies
    that there may occur an exception in the method. It is always used with method signature.

 */


/* public class j38_Exception {
    public static void main(String[] args) {
        
        try{
            int a = 10/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("finally");
        }

        // throw
        try{
            throw new ArithmeticException("throw");
        }catch(ArithmeticException e){
            System.out.println(e);
        }
         
        //throws



    }
} */


//throws

public class j38_Exception {
	public static void main(String[] args)
		throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("Hello Geeks");
	}
}




