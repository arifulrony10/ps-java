package Patterns.BasicPatterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        // define row number
        int n = 5;

        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // when i+j == event print 1 | when i+j == odd print 0
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
