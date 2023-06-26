package Patterns.BasicPatterns;

/*
 * print the following pattern
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

public class PrintNumberPyramid {
    public static void main(String[] args) {
        // here n is number of row
        int n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // this will print number which depends on outter `i`
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // This will go to next line
            System.out.println();
        }
    }
}
