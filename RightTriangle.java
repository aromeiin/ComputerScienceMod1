public class RightTriangle {
    public static void main(String[] args) {
        // Parse the command-line arguments into integer variables
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Each integer must be positive.
        boolean positiveSides = a > 0 && b > 0 && c > 0;

        // Check for the Pythagorean theorem (a^2 + b^2 = c^2)
        boolean isRightTriangle = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);

        // Print the final result by combining the two boolean expressions
        System.out.println(positiveSides && isRightTriangle);
    }
}
