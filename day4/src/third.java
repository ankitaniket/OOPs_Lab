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
