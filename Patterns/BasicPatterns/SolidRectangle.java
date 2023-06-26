package Patterns.BasicPatterns;

public class SolidRectangle {
    public static void main(String[] args) {
        int row = 4;
        int column = 5;
        // outter loop
        for (int i = 0; i < row; i++) {
            // inner loop
            for (int j = 0; j < column; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
