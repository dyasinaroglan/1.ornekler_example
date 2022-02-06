package Bolum8.Classes.Encapsulation1;

public class Book {
    public String adı,author,publisher;
    private int numberOfPage;

    public Book(String adı, String author, String publisher, int numberOfPage) { //public yazmama gerek yok.
        this.adı = adı;
        this.author = author;
        this.publisher = publisher;
        if(numberOfPage<1){
            this.numberOfPage =10;
        }else {
            this.numberOfPage = numberOfPage;
        }
    }
    public void getPageNumber(){

        System.out.println(numberOfPage);
    }

    public String getAdı() {
        return adı;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
    //getter ve setter lar sayesinde üzerinde oynama yapabilirim

    public void setNumberOfPage(int numberOfPage) {
        if(numberOfPage<1){
            System.out.println("sayfa sayısı negatif olamaz");
            this.numberOfPage = 0;
        }else {
            this.numberOfPage = numberOfPage;
        }
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "**Book**" +
                "\nadı= " + adı +
                "\nauthor= " + author +
                "\npublisher= " + publisher +
                "\nnumberOfPage=" + numberOfPage ;
    }
}
