package Gun36._03_Ornek;

public class GeometriMain {
    public static void main(String[] args) {
        Cember ciz=new Cember();
        ciz.ciz(); // cember cizildi

        Dikdortgen dik=new Dikdortgen();
        dik.ciz(); // dikdörtgen çizildi


        //interface lerden nesne üretileme fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // çember çizildi
        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişeniirsin

        cizdirme(ciz);
        cizdirme(dik);
    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}
