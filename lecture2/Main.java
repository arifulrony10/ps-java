package lecture2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    take input from user and display the output
    // import scanner to take input
    Scanner sc = new Scanner(System.in);

    // variables
    int num1, num2, sum;

    System.out.println("Enter the 1st number: ");
    num1 = sc.nextInt();
    System.out.println("Enter 2nd number: ");
    num2 = sc.nextInt();
    // calculate sum
    sum = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
