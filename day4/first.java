// Q.1. Write a java program to print the exception information using printStackTrace() method.

public class first {
    public static void main(String[] args) {

        try{
            int i=4/0;
        }catch(Throwable e){
            e.printStackTrace();
            System.err.println("Cause : "+e.getCause());
        }
    }
}

// Output
// java.lang.ArithmeticException: / by zero
// 	at first.main(first.java:7)
// Cause : null
