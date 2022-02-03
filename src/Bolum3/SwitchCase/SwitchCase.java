package Bolum3.SwitchCase;

import java.util.Scanner;

public class SwitchCase {

    public static void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int sayı1 = scanner.nextInt();
        System.out.println("enter the second number");
        int sayı2 = scanner.nextInt();

        System.out.println("Sum is = "+ (sayı1+sayı2));
    }
    public static void avarage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int sayı1 = scanner.nextInt();
        System.out.println("enter the second number");
        int sayı2 = scanner.nextInt();

        System.out.println("Avarage = " + (sayı1+sayı2)/2);
    }
    public static void evenOrOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int sayı = scanner.nextInt();
        if(sayı%2 == 0){
            System.out.println("number is even");
        }else {
            System.out.println("number is Odd");
        }
    }
    public static void positive(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int sayı = scanner.nextInt();
        if(sayı>0){
            System.out.println("number is positive");
        }else {
            System.out.println("number is negative");
        }
    }
    public static void prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int sayı = scanner.nextInt();
        int count =0;
        for (int i = 2; i < sayı ; i++) {
            if(sayı%i == 0){
                count++;
            }
            if (count == 0){
                System.out.println("it is a prime number");
            }else {
                System.out.println("it is a not prime number");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. Add two numbers");
            System.out.println("2. Average of two numbers");
            System.out.println("3. Even or odd");
            System.out.println("4. Positive or negative number");
            System.out.println("5. Prime number or not");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 : add();
                break;
                case 2 : avarage();
                break;
                case 3 : evenOrOdd();
                break;
                case  4 : positive();
                break;
                case 5 : prime();
                break;
                case 6 : System.exit(0);
            }
        }

    }
}
