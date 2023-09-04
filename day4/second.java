// Q.2. Write a java program to print the exception information using toString() method.

public class second {
    public static void main(String[] args) {
        try
        {
            int a = 100/0;
        }
        catch (Exception e)
        {
            System.out.println(e.toString()); //System.out.println(e);
        }
    }
}

// Output
// java.lang.ArithmeticException: / by zero
