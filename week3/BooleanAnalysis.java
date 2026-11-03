// Verifies the analysis of complex boolean expressions.
public class BooleanAnalysis {
    public static void main(String[] args) {
        // Expression 1: (5 > 3) && (4 < 2) || (10 == 10)   -> true
        boolean part1 = (5 > 3);      // true
        boolean part2 = (4 < 2);      // false
        boolean part3 = (10 == 10);   // true

        System.out.println("5 > 3: " + part1);
        System.out.println("4 < 2: " + part2);
        System.out.println("10 == 10: " + part3);

        // && binds tighter than ||, so this is (part1 && part2) || part3
        boolean intermediate = part1 && part2;
        System.out.println("part1 && part2: " + intermediate);
        boolean finalResult = intermediate || part3;
        System.out.println("Final result: " + finalResult);

        boolean directResult = (5 > 3) && (4 < 2) || (10 == 10);
        System.out.println("Direct result: " + directResult);

        // Expression 2: !(5 > 3) || (4 < 2) && (10 == 10)   -> false
        boolean result2 = !(5 > 3) || (4 < 2) && (10 == 10);
        System.out.println("\nExpression 2: !(5 > 3) || (4 < 2) && (10 == 10)");
        System.out.println("!(5 > 3): " + !(5 > 3));
        System.out.println("(4 < 2) && (10 == 10): " + ((4 < 2) && (10 == 10)));
        System.out.println("Result 2: " + result2);
    }
}
