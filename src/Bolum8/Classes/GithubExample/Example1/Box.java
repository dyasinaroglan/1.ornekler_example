package Bolum8.Classes.GithubExample.Example1;

public class Box {
    double lenght,width,height;  //uzunluk, genişlik, yükseklik

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }
    public double volume(){
        return lenght*width*height;
    }
}
