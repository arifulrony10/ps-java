package Patterns.BasicPatterns;

// Palindromic Number Pyramid
public class PalindromicNumberPyramid {
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

            // first part
            for (int j = i; j >= 1; j--) {

                System.out.print(j);

            }

            // seconda part
            for (int j = 2; j <= i; j++) {

                System.out.print(j);

            }

            // print new line
            System.out.println();
        }

    }
}
