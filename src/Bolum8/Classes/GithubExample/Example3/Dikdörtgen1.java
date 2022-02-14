package Bolum8.Classes.GithubExample.Example3;

public class Dikdörtgen1 {

    double lenght;  //uzunluk
    double width;   //genislik

    public Dikdörtgen1(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    public double area(){
        return lenght*width;
    }
    public double perimeter(){
        return 2*(lenght+width);
    }
    public void disPlay(){
        System.out.println("dikdörtgenin alanı = " + String.format("%.3f" , area()));
        System.out.println("dikdörtgenin çevresi = " + String.format("%.3f" , perimeter()));
    }
}
