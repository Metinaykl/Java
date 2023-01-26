package Gun30.Ornek1;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAdi="Yıldırım İlkokulu";
    //sen bitanesin
    //hepsi için geçerli tek eleman
    //Tekrarlanan ve tüm nesneler için kullanılacak
    //değişkenler için STATİC kullanıyoruz.
    // static=sen birtanesin
    // static varsa hafızada tasarruf sağlar.
    //hepsine atanır tek olarak hafızada bulunur.
    // tipin sınıfın classın değişkeni oldu.

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAdı='" + okulAdi + '\'' +
        '}';
    }
}
