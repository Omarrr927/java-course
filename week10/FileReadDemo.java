// Reading a file line by line with Scanner, handling a missing file.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        String fileName = "transactions.txt";   // created in FileWriteDemo

        try {
            File file = new File(fileName);

            // A Scanner that reads from the File object (not System.in).
            Scanner fileScanner = new Scanner(file);

            System.out.println("=== READING FILE: " + fileName + " ===");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();   // free resources
            System.out.println("=== FILE READING COMPLETE ===");

        } catch (FileNotFoundException e) {
            // If the file doesn't exist, this prevents the program from crashing.
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }
    }
}
