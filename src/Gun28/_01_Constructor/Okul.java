package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        // 1.Yöntem
        Ogrenci ogr=new Ogrenci(); // nesne oluşma anı
        ogr.id=1;
        ogr.ad="ismet";
        ogr.soyad="temur";
        ogr.sinifi=5;
        System.out.println("ogr.ad = " + ogr.ad);


        // 2.Yöntem
        Ogrenci og2=new Ogrenci(1,"ismet","temur",5);
        System.out.println("og2.ad = " + og2.ad);

    }
}
