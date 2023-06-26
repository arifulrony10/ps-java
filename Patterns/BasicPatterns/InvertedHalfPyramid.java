package Patterns.BasicPatterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        // Inverted pyramid
        int n = 4;
        // outter loop
        for(int i = n; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
