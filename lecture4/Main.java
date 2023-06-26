package lecture4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print the sum of n naturan numbers
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int sum = 0;

        // for (int i = 0; i <= num; i++) {
        // sum = sum + i;
        // }

        // System.out.println(sum);

        // print all the even number till n
        Scanner sc = new Scanner(System.in);

        System.out.println("Select");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("Enter num");
            int mark = sc.nextInt();
            if (mark >= 90) {
                System.out.println("This is good!");
            } else if (60 <= mark && mark <= 89) {
                System.out.println("This is also good!");
            } else if (0 <= mark && mark <= 59) {
                System.out.println("This is good as well!");
            } else {
                System.out.println("Invalid input");
            }

        } else if (input == 0) {
            System.out.println("Exit the program");
        } else {
            System.out.println("Wrong input!");
        }

    }
}
