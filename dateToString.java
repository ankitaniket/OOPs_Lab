import java.text.SimpleDateFormat;
import java.util.Date;

public class dateToString {

    public static void main(String[] args) {
        // Create a Date object
        Date currentDate = new Date();

        // Define the date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Convert Date to String
        String dateString = dateFormat.format(currentDate);

        // Print the converted string
        System.out.println("Date as String: " + dateString);
    }


}


