// Implicit (widening) and explicit (narrowing) type conversion.
public class TypeConversion {
    public static void main(String[] args) {
        // IMPLICIT CASTING (WIDENING)
        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("=== IMPLICIT CASTING ===");
        System.out.println("int value: " + intValue);
        System.out.println("double value (from int): " + doubleValue);

        long longValue = intValue;
        System.out.println("long value (from int): " + longValue);

        float floatValue = 3.14f;
        double doubleFromFloat = floatValue;
        System.out.println("double value (from float): " + doubleFromFloat);

        // EXPLICIT CASTING (NARROWING)
        double pi = 3.14159;
        int truncatedPi = (int) pi;
        System.out.println("\n=== EXPLICIT CASTING ===");
        System.out.println("double pi: " + pi);
        System.out.println("int pi (truncated): " + truncatedPi);

        double largeDouble = 123.456789;
        float smallFloat = (float) largeDouble;
        System.out.println("double value: " + largeDouble);
        System.out.println("float value (cast): " + smallFloat);

        // TYPE MISMATCH ERRORS (these would not compile if uncommented)
        // int wrongInt = 3.14;
        // int wrongString = "100";
        // int wrongBoolean = true;
        // String wrongChar = 'A';
        System.out.println("\n=== TYPE MISMATCH ERRORS ===");
        System.out.println("The following lines would cause compilation errors:");
        System.out.println("int wrongInt = 3.14; // double to int without cast");
        System.out.println("int wrongString = \"100\"; // String to int");
        System.out.println("int wrongBoolean = true; // boolean to int");
        System.out.println("String wrongChar = 'A'; // char to String");

        // STRING CONVERSION
        int number = 42;
        String numberString = "" + number;
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("45.67");
        System.out.println("\n=== STRING CONVERSION ===");
        System.out.println("Number as string: " + numberString);
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
    }
}
