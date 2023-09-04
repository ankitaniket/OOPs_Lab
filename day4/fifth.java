// Q.5 Write a java Java Program to Handle multiple exception.
public class fifth {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[8]=30;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}

// Output
// ArrayIndexOutOfBounds Exception occurs
// rest of the code
