// Q.7. Write a Java program that demonstrates the use of throw

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class seven {
    public static void main(String[] args) {
        try {
            // Simulate a condition where a custom exception should be thrown
            int age = 15;
            if (age < 18) {
                throw new CustomException("You must be at least 18 years old.");
            }

            // If age is 18 or older, continue with the program
            System.out.println("You are eligible to vote.");
        } catch (CustomException e) {
            // Catch the custom exception and handle it
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }
}

// Output
// Custom Exception: You must be at least 18 years old.
