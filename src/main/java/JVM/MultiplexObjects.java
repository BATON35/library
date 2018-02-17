package JVM;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class MultiplexObjects {

    public static List lista = new LinkedList<BigDecimal>();

    public static void main(String[] args) throws InterruptedException {

        String test = "";

        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {

                BigDecimal bd = new BigDecimal(8);
                lista.add(bd);
                //    System.out.println(test);
            }


        }
        System.out.println("Program duration : " + (System.nanoTime() - start) / 1000000000);
    }
}
