import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countWord {
    public static void main(String[] args) {
        String fileName = "/Users/ankitaniket/IdeaProjects/first/src/data.txt"; // Replace with your file's path

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words using whitespace as delimiter
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
