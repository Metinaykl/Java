package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam=ogrNot1+ogrNot2+ogrNot3+ogrNot4; // byte -> int atınca problem cikarmadi (GENİŞLETME - Widening Casting)
        // çünkü byte icin hafızada ayrılan, zaten int e sigar, sigdigi icin kabul ederim.
        // cünkü veri kaybi olma ihtimali hic yok.

        ogrNot1= (byte) toplam; // int *> byte atınca dur bakalım dedi (DARALTMA - Narrowing Casting)
        // büyük hafıza ayrılmış bir alanı , kücük hafıza ayrılmıs alana atma işlemi var.
        // veri kaybi ihtimali var mı
        System.out.println("toplam = " + toplam);





    }
}
