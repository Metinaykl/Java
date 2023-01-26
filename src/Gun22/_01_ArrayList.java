package Gun22;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar=new ArrayList<>();
       sayilar.add(50);
       sayilar.add(5);
       sayilar.add(456);
       sayilar.add(45);
       sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Tersine Çevirme İşlemi
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Max ve Min Eleman Bulma
        System.out.println("Collections.max(sayilar) = " + Collections.max(sayilar));
        System.out.println("Collections.min(sayilar) = " + Collections.min(sayilar));

        //  Bütün elemanları set etme
        Collections.fill(sayilar,0);  // bütün elemanlara 0 atar
        System.out.println("sayilar = " + sayilar);

        // Replace
        Collections.replaceAll(sayilar,0,5); // 0 olan elemanları 5 atar
        System.out.println("sayilar = " + sayilar);

        // Tanımlarken Değer Atama
        int[]dizi={2,3,4,5};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String> strListe=new ArrayList<>(Arrays.asList("ahmet","mehmet","büşra","roman"));
        System.out.println("strListe = " + strListe);

        ArrayList<Integer>liste2=new ArrayList<>();
        Collections.addAll(liste2,2,3,4,5,6,7);
        System.out.println("liste2 = " + liste2);

        // diziyi direk ArrayListe nasıl atarım
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer>liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);

        Collections.replaceAll(strListe,"ahmet","metin"); // belli bölümleri belli şeylerle değiştirme sayıdada aynı
        System.out.println("strListe = " + strListe);

    }
}
