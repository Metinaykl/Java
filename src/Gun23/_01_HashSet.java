package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafızada sadece bir sayı saklar
        int [] dizi=new int[6]; // tek boyutlu dizi sabit elamanlı 6 elemanlı
        int[][] tablo=new int[3][20]; // 2 boyutlu dizi sabit elamanlı 3x20 60 elemanlı


        // dizi lazım ama boyutu ekledikce artsın sildikce azalsın
        ArrayList<Integer> liste=new ArrayList<>(); // boyu değişken
        ArrayList<ArrayList<Integer>> liste2=new ArrayList<>(); // 2 boyutlu 2 ayrı değişken

        /***************************************************/

        // Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle set ver bana, yani dizi tip ver bana.
        // Java mektubumuza cevap verdi :
        // Sevgili Muhammed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
        // dizilerimiz var dedi.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.

        HashSet<Integer> list=new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(38);
        list.add(22);
        list.add(4);
        boolean eklendiMi=list.add(5); // true
        boolean tekrareklendiMi=list.add(5); // false
        list.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrareklendiMi = " + tekrareklendiMi);
        System.out.println("list = " + list);
    }

}