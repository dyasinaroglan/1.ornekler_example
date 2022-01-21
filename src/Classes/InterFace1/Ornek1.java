package Classes.InterFace1;

import java.util.*;

public class Ornek1 {
    public static void main(String[] args) {

        final String name = ""; // final fieldler

        InterFace c1 = new Class1();
        InterFace c2 = new Class2();

        InterFace2 i = new InterFace2() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };


    }
}

