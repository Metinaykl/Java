package Gun30._02_FinalVaribles.Ornek2;

public class Sabitler {

    final static int gunSaat=24;
    final static int saatDk=60;
    final static int dksaniye=60;


    public static int hesapla(int gun,int saat,int dk) {
        int toplamSaniye=gun*Sabitler.gunSaat*Sabitler.saatDk*Sabitler.dksaniye
                +saat*Sabitler.saatDk*Sabitler.dksaniye+dk*Sabitler.dksaniye;

        return toplamSaniye;

    }

    }
