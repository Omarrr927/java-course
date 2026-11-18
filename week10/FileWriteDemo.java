// Writing data to a text file. try-with-resources closes the file automatically.
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        String fileName = "transactions.txt";

        // Resources declared inside the try parentheses are CLOSED automatically when the
        // block finishes (even if an exception occurs). This prevents resource leaks!
        try (FileWriter fw = new FileWriter(fileName);
             PrintWriter pw = new PrintWriter(fw)) {

            System.out.println("Writing to file: " + fileName);

            pw.println("TRX001, DEPOSIT, 5000, SUCCESS");
            pw.println("TRX002, WITHDRAW, 2000, SUCCESS");
            pw.println("TRX003, DEPOSIT, 15000, SUCCESS");
            pw.println("TRX004, TRANSFER, 1000, FAILED");

            if (pw.checkError()) {
                System.out.println("An error occurred while writing.");
            } else {
                System.out.println("Data written successfully!");
            }

        } catch (IOException e) {
            // Handles file-related errors (e.g., permission denied).
            System.out.println("Error writing to file: " + e.getMessage());
        }
        // The file is now safely closed and saved in the week10 folder.
    }
}
