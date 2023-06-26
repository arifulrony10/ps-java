package Patterns.BasicPatterns;

public class HalfPyramid {
    public static void main(String[] args) {
        /*
         * row will be the collumn
         * 1 row 1 col
         * 2 row 2 col
         * 3 row 3 col
         */
        int n = 4;
        // outter loop
        for(int i = 1; i <= 4; i++) {
            // inner loop
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
