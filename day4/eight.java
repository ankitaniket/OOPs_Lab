// Q.8. Write a java program Class that represents use-defined exception.

class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
public class eight {
    public static void main(String args[])
    {
        try {
            throw new MyException("NSEC");
        }
        catch (MyException ex) {
            System.out.println("Caught");

            System.out.println(ex.getMessage());
        }
    }
}

// Output
// Caught
// NSEC
