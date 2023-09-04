
// Q.10. Write a Java Program to Illustrate Handling of Checked Exception

import java.io.*;
class ten {

    public static void main(String[] args)
            throws FileNotFoundException
    {
        FileInputStream NSEC = null;

        try {
            NSEC = new FileInputStream(
                    "/usr/ankit/NSEC.txt");
        }

        catch (FileNotFoundException e) {

            System.out.println("File does not exist");
        }
    }
}


// Output
// File does not exist
