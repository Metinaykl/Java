package Gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {

        Map<Integer,String > hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm); // hızlı çalışmak için kendine göre sıralar

        Map<Integer,String > lhm=new LinkedHashMap<>(); // Maplerden LinkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm); // Eklendiği sıraya göre sıralı

        Map<Integer,String > ths=new TreeMap<>(); // Maplerden TreeMap
        ths.put(9,"tilki");
        ths.put(2,"kedi");
        ths.put(30,"köpek");
        ths.put(11,"kuş");
        ths.put(4,"kurt");
        System.out.println("ths = " + ths); // Her zaman sıralı KEY e göre,kendinden sortlu.
    }
}
