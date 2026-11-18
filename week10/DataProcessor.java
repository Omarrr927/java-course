// Reads a CSV of student marks, processes it with a Map, writes a summary report.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProcessor {
    public static void main(String[] args) {
        // Key = student name, Value = status (PASSED/FAILED)
        Map<String, String> results = new HashMap<>();

        String inputFile = "students.csv";
        String outputFile = "report.txt";

        double totalMarks = 0;
        int studentCount = 0;

        // STEP 1: READ AND PROCESS THE CSV
        try {
            File file = new File(inputFile);
            Scanner scanner = new Scanner(file);

            // Skip the header if there is one (ours has none):
            // scanner.nextLine();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // "101,Alice,85" becomes ["101", "Alice", "85"]
                String[] parts = line.split(",");

                // Make sure the line has exactly 3 parts to prevent errors.
                if (parts.length == 3) {
                    String id = parts[0];
                    String name = parts[1];
                    int marks = Integer.parseInt(parts[2]);   // String -> int

                    totalMarks += marks;
                    studentCount++;

                    if (marks >= 50) {
                        results.put(name, "PASSED");
                    } else {
                        results.put(name, "FAILED");
                    }
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
            return;   // exit if we can't read the input
        } catch (NumberFormatException e) {
            System.out.println("Error: The file contains non-numeric marks.");
            return;
        }

        // STEP 2: WRITE THE REPORT TO A NEW FILE
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("=== EXAMINATION REPORT ===");
            writer.println("Total Students Processed: " + studentCount);
            writer.println("Class Average: " + (totalMarks / studentCount));
            writer.println("--------------------------");

            for (Map.Entry<String, String> entry : results.entrySet()) {
                writer.println("Student: " + entry.getKey() + " | Result: " + entry.getValue());
            }

            System.out.println("Data processing complete! Check " + outputFile + " for results.");

        } catch (IOException e) {
            System.out.println("Error writing report file: " + e.getMessage());
        }
    }
}
