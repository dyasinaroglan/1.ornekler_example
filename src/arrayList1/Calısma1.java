package arrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.spi.AbstractResourceBundleProvider;

public class Calısma1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("volvo");
        cars.add("mercedes");
        cars.add("fiat");
        Collections.sort(cars);


        cars.set(1,"tofaş");
        System.out.println(cars);



    }

}
