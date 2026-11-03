// This program contains array index errors. DO NOT expect it to finish normally.
public class ArrayIndexDebug {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("=== BUG 1 ===");
        // BUG: i <= numbers.length lets i reach 5, but the last valid index is 4.
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\n=== BUG 2 ===");
        // BUG: index 5 is out of bounds for a length-5 array.
        System.out.println("Last element: " + numbers[5]);

        System.out.println("\n=== BUG 3 ===");
        // BUG: index -1 is invalid; arrays start at 0.
        System.out.println("First element: " + numbers[-1]);
    }
}
