package JVM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SzukajBledu {
           public static List<Integer> lista = new ArrayList<>();
           public static List<Integer> liczbyPierwsze = new ArrayList<Integer>();


        public static void main(String[] args) {
            for (int i = 0; i < 1000; i++) {
                lista.add(i + 1);
            }
            List<Integer> prim = lista.stream().filter(liczba -> {
                List<Integer> zlozone = new ArrayList<>();
                for (Integer numer : lista) {
                    liczbyPierwsze.addAll(zlozone);
                    List<Integer> comp = lista.stream().filter(liczba1 -> liczba1 % numer == 0&&liczba1>numer&&numer>1).collect(Collectors.toList());
                    zlozone.addAll(comp);
                }
                return !zlozone.contains(liczba);

            }).collect(Collectors.toList());
            System.out.println(prim);
        }

}
