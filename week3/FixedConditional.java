// Corrected version: age must be >= 18 AND <= 65.
public class FixedConditional {
    public static void main(String[] args) {
        int[] ages = {10, 20, 70};

        for (int age : ages) {
            if (age >= 18 && age <= 65) {
                System.out.println("age " + age + ": You are of working age.");
            } else {
                System.out.println("age " + age + ": You are not of working age.");
            }
        }
    }
}
