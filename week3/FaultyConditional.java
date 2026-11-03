// This program has a logic error: || should be &&.
// (Loops over several ages so the bug is visible: 10 and 70 wrongly pass.)
public class FaultyConditional {
    public static void main(String[] args) {
        int[] ages = {10, 20, 70};

        for (int age : ages) {
            // BUG: should be age >= 18 && age <= 65
            if (age >= 18 || age <= 65) {
                System.out.println("age " + age + ": You are of working age.");
            } else {
                System.out.println("age " + age + ": You are not of working age.");
            }
        }
    }
}
