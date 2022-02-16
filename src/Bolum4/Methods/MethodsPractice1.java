package Bolum4.Methods;

public class MethodsPractice1 {
    public static void main(String[] args) {

        daysInMonth(2,2023);

    }
    public static void daysInMonth(int number, int year) {
        String result = "";
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";
            }
        } else {
            result = "Invalid NUMBER";
        }
        System.out.println(result);
    }
}
