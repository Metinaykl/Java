package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{


    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void sesi() {
        System.out.println("cıyak,piyuv");

    }

    @Override
    void yiyecegi() {
        System.out.println("Et");

    }

    @Override
    void yemekMiktari() {
        System.out.println("2 KG");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("4 Saat");
    }
}
