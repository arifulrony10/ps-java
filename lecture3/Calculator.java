package lecture3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===== CALCULATOR ======");

        int num1, num2, add, sub, mul, div, mod;

        // take input
        Scanner sc = new Scanner(System.in);

        // ask user what he wants to do

        System.out.println(
                "What you want to calculate? please press \n press 1 for addition \n press 2 for subtraction \n press 3 for multiplication \n press 4 for division \n press 5 for modulo or reminder");
        int selectedNumber = sc.nextInt();

        System.out.print("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = sc.nextInt();

        switch (selectedNumber) {
            case 1:
                add = num1 + num2;
                System.out.println("Addition of num1 and num2 is " + add);
                break;
            case 2:
                sub = num1 - num2;
                System.out.println("Subtraction of num1 and num2 is " + sub);
                break;
            case 3:
                mul = num1 * num2;
                System.out.println("Multiplication of num1 and num2 is " + mul);
                break;
            case 4:
                div = num1 / num2;
                System.out.println("Division of num1 and num2 is " + div);

                break;
            case 5:
                mod = num1 % num2;
                System.out.println("Reminder of num1 and num2 is " + mod);
                break;
            default:
                System.out.println("You have entered invalid key!");
                break;
        }

    }
}
