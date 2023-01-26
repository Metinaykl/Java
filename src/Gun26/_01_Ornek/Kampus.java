package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAdi="Metin Aykul";
        ogr.okulu=new Okul();

        ogr.okulu.adi="Hacettepe Universitesi";
        ogr.okulu.mudurAdi="İsmet Temur";
        ogr.okulu.ucreti=50000;

        System.out.println("Ogrenci Okul No = "+ogr.okulNo);
        System.out.println("Ogrenci Ad Soyad = "+ogr.tamAdi);
        System.out.println("Ogrenci Okulu = "+ogr.okulu.adi);
        System.out.println("Ogrenci Okul Müdürü = "+ogr.okulu.mudurAdi);
        System.out.println("Okul Ücreti = "+ogr.okulu.ucreti);
    }
}
