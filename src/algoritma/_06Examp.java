package algoritma;

import java.util.Scanner;

public class _06Examp {
    public static void main(String[] args) {

        //Write a program that finds factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
