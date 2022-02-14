package Bolum8.Classes.GithubExample.Example4;

public class Shapes {
    public void circleArea(double x){
        System.out.println("dairenin alanı = " + String.format("%.2f", (3.14*3.14*x)));
    }
    public void squareArea(double x){
        System.out.println("karenin alanı = " + String.format("%.2f", (x*x)));
    }
    public void rectangleArea(double x, double y){
        System.out.println("dikdörtgenin alanı = " + String.format("%.2f",(x*y)));
    }
}
