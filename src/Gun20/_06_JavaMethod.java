package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul("İsmet",s1, s2);
        int sonuc2 = toplamBul("mehmet",s1, s2, s3);
        int sonuc3 = toplamBul("Ali",s1, s2, s3, s4);

        //parametreler aynı tip sadece miktarlar farklı
        //bu tip durumlar için bir kolaylık sağlanmış.

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    // ... ile ilgili 2 kural var
    // 1.Bir metodda parametre olarak sadece 1 tane olabilir
    // 2. Her zaman son parametre olmalı
//gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al


    public static int toplamBul(String isim, int... sayilar){ //kaç sayı gelirse gelsin onları sayı şeklinde alır
        int toplam=0;
        System.out.println("isim = " + isim);
        for (int i = 0; i < sayilar.length ; i++) {
            toplam=toplam+sayilar[i];
            
        }
        return toplam;
    }
}

