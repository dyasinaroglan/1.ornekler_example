package classesExample.task3;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;

    ArrayList<Lesson> lessons = new ArrayList<>(); //Öğrencilerin derslerini oluşturmamız lazım.
    //derslerini de arrayList e atıyoruz. birden çok ders. ne türünde olacak Lesson türünde.

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
    }
    public void setLesson(Lesson lesson){
        if(getTotalCredit()+lesson.hour<=maxCredit){
            lessons.add(lesson);
        }
        else {
            System.out.println("kredi fazlası nedeni ile "+lesson.name+ " dersi "+name+" eklenmedi.");
        }

    }
    public int getTotalCredit(){
        int crd =0;
        for (Lesson lesson : lessons) {
            crd+=lesson.hour;
        }
        return crd;
    }
    public String toString() {
        return "Adı = " + name +
                "\nmaxCredit= " + maxCredit +
                "\ntotal credit= "+getTotalCredit()+
                "\nlessons=" + lessons ;
    }
}
