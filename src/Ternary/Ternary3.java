package Ternary;

public class Ternary3 {
    public static void main(String[] args) {
        int num1 =5;
        int num2 =7;

        System.out.println((num1>num2) ? num1+">"+num2 : num1+"<"+num2);
        System.out.println(max(2,6));
    }
    public static int max(int a, int b){
        return (a>b) ? a : b;
    }
}
