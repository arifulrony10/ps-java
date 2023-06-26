package Patterns.BasicPatterns;

// Solid Rhombus

public class SolidRhombus {
    public static void main(String[] args) {
        // define row number
        int n = 4;
        // outter loop
        for (int i = 1; i<= n; i++) {
            // inner loop
            // for printing spaces
            for(int j = 1; j <= n - i + 1; j++ ) {
                System.out.print("  ");
            }

            // for printing star
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
