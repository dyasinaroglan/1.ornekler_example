package Bolum8.Classes.InterFace4;

interface IVehicle {
    String drive();

    default void defaultMethod() {
        System.out.println("interface default method");
    }

    static void autoPilot() {
        System.out.println("interface static method");
    }
}
