package Gun30.Ornek1;

public class Okul {
    public static void main(String[] args) {
        // Ogrenci ogr1=new Ogrenci("Metin","Aykul");
        //  Ogrenci ogr2=new Ogrenci("Kerem","Dizdar");
        // Ogrenci ogr3=new Ogrenci("Selin","Topal");

        //...
        //...
        //  Ogrenci ogr499=new Ogrenci("Sevdanur","Hoş");
        // Ogrenci ogr500=new Ogrenci("Gizem","Şahbaz");









        Ogrenci ogr1=new Ogrenci("ismet","temur");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAdi="Atatürk İlkokulu";
        System.out.println("ogr1 tekrar = " + ogr1);


        // aynı verinin çok kez girişi engellendi
        // aynı verinin hafızada NESNE sayisi kadar tekrarlanması engellendi

        Ogrenci ogr2=new Ogrenci("Ali","Yıldırım");
        System.out.println("ogr2 = " + ogr2);


    }
}
