package Patterns.BasicPatterns;

public class HollowRectangle {
    public static void main(String[] args) {

        /*
         * Print the hollow parrer
         * *****
         * *   *
         * *   *
         * *****
         */

         int row = 4;
         int col = 5;

        //  outter loop

        for(int i = 1; i <= 4; i++) {

            // inner loop
            for (int j = 1; j <= 5; j++) {
                // cell (i, j)
                if(i == 1 || j == 1 || i == row || j == col) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
