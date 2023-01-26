package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi array: boyut sayısı belli, sonradan değiştirilemez.
        int[] dizi=new int[5]; // Array 5 elamanlı boyutu sonradan değiştirelemiyor

        // boyutu dinamik olsun ,eleman ekledikce uzasın sildikce kısalsın
        // ArrayList : boyutunu baştan vermene bile gerek yok , boyutu başlangıcta 0
        // eleman ekledikce artar,sildikce eksilir.


        ArrayList<Integer> sayi=new ArrayList<>();
        ArrayList<String> stringlist=new ArrayList<>();
        ArrayList<Double> doublesayi=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1
        isimler.add("Metin"); // uzunluk 2
        isimler.add("Hacer"); // uzunluk 3
        isimler.add("Aynur"); // uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Muhammed"); // verilen index'e ekliyor diğerleri sona doğru 1 kayıyor
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer"); // verilen indexteki elemanı değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Metin"); // var mi
        System.out.println("varMi = " + varMi); // true

        isimler.remove("Metin"); // değere göre siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiğinde index kabul ediyor ve ona göre siliyor
        System.out.println("isimler = " + isimler);

        int indexofAynur=isimler.indexOf("Aynur");
        System.out.println("indexofAynur = " + indexofAynur);

        String ilkEleman=isimler.get(0);// verilen indexi değeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();// her şeyi temizliyor
        System.out.println("isimler = " + isimler);
    }
}
