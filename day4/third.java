// Q.3. Write a java program to print the exception information using getMessage() method.

public class third {
    public static void main(String[] args) {
        try
        {
            int a = 100/0;
        }
        catch (Exception e)
        {
            System.out.println("Reason of exception is " + e.getMessage());

        }
    }
}

// Output
// Reason of exception is / by zero
