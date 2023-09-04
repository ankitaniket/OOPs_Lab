// Q.4. Write a java program Handling Technique for NullPointerException

public class four {
    public static void main(String[] args) {
        String ptr = null;

        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("nsec"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught is found");
        }
    }
}

// Output
// NullPointerException Caught is found
