package Patterns.BasicPatterns;

public class InvertedHalfPyramidsWithNumbers {
    public static void main(String[] args) {
        // define row number
        int n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                /*
                 * row 1 / i == 1 : j -> 1 - 5 => n - i + 1
                 * row 2 / i == 2 : j -> 1 - 4 => n - i + 1
                 * row 3 / i == 3 : j -> 1 - 3 => n - i + 1
                 * row 4 / i == 4 : j -> 1 - 2 => n - i + 1
                 * row 5 / i == 5 : j -> 1 - 1 => n - i + 1
                 */
                System.out.print(j + " ");
            }

            // go to new line
            System.out.println();
        }
    }
}
