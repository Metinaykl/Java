package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
        //    Kediler için (renk,kilo,cinsi)
        //    kopekler için (renk,kilo, cinsi)
        //    yılanlar için renk, kilo, cinsi, uzunluk)
        //    ordek için (renk, kilo, cinsi, kanatAcikligi)
        //    bütün hayvanların konustu metodu vardır.
        Kopek kopek1=new Kopek("beyaz",50,"kangal");
        kopek1.konustu();
        Kedi kedi1=new Kedi("kahvrerengi",20,"iran");
        kedi1.konustu();
        Ordek ordek1=new Ordek("siyah",3,"govel",90);
        ordek1.konustu();
        Yilan yilan1=new Yilan("kırmız",25,"kobra",70);
        yilan1.konustu();




    }
}
