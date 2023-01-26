package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void sesi() {
        System.out.println("Miyav");

    }

    @Override
    void yiyecegi() {
        System.out.println("yaş mama");

    }

    @Override
    void yemekMiktari() {
        System.out.println("100GR");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("12 saat");

    }
}
