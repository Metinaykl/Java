package Gun35._03_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Metin","Aykul","Ogrenci","5A");
        Calisan cal1=new Calisan("ismet","Temur","Öğretmen","Yazılım");

        Muduriyet.kimlikYaz(ogr1);
        Muduriyet.kimlikYaz(cal1);

    }
}
