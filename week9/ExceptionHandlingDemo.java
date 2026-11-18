// Exception handling with try-catch-finally.
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // EXAMPLE 1: ArithmeticException (unchecked)
        System.out.println("=== EXAMPLE 1: Division by Zero ===");
        int numerator = 10;
        int denominator = 0;

        try {
            // Code inside 'try' is monitored for errors.
            int result = numerator / denominator;
            System.out.println("Result: " + result);   // will NOT print
        } catch (ArithmeticException e) {
            // On an ArithmeticException the program jumps here. It does NOT crash.
            System.out.println("Error caught: You cannot divide by zero!");
            System.out.println("Java says: " + e.getMessage());
        } finally {
            // 'finally' ALWAYS executes, whether or not an exception occurred.
            System.out.println("Finally block executed (cleaning up resources).");
        }
        System.out.println("Program continues safely...\n");

        // EXAMPLE 2: ArrayIndexOutOfBoundsException (unchecked)
        System.out.println("=== EXAMPLE 2: Array Out of Bounds ===");
        int[] numbers = {1, 2, 3};

        try {
            // Index 5 does not exist; the array only goes up to index 2.
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: The array index is out of bounds!");
        }
        System.out.println("Program continues safely...\n");

        // EXAMPLE 3: a method that handles its own exception
        System.out.println("=== EXAMPLE 3: Method with Exception Propagation ===");
        performRiskyOperation();
        System.out.println("Program finished.");
    }

    public static void performRiskyOperation() {
        try {
            String text = "abc";
            int number = Integer.parseInt(text);   // throws NumberFormatException
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Error caught: Invalid number format.");
        }
    }
}
