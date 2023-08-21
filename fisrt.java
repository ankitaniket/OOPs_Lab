import java.util.Scanner;

public class fisrt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int charCount = countCharacters(input);

        System.out.println("Total number of characters: " + charCount);
    }

    public static int countCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

}
