package Patterns.BasicPatterns;

// Number pyramid

public class FullNumberPyramid {
    public static void main(String[] args) {
        // define row number
        int n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // new line
            System.out.println();
        }
    }
}
