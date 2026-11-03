// This program contains infinite loops. DO NOT RUN IT - it never stops.
public class InfiniteLoopDebug {
    public static void main(String[] args) {
        System.out.println("=== BUG 1 ===");
        int x = 1;
        // BUG: x is never incremented, so x <= 5 is always true. FIX: x++;
        while (x <= 5) {
            System.out.println("x = " + x);
            // Missing: x++;
        }

        System.out.println("\n=== BUG 2 ===");
        // BUG: i starts at 5 and increases, so i >= 1 is always true. FIX: i--
        for (int i = 5; i >= 1; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n=== BUG 3 ===");
        int y = 10;
        // BUG: y is never decremented, so y > 0 is always true. FIX: y--;
        while (y > 0) {
            System.out.println("y = " + y);
            // Missing: y--;
        }
    }
}
