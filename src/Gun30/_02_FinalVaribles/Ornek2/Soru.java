package Gun30._02_FinalVaribles.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun;
        int saat;
        int dk;

        //1.Yöntem
        Scanner oku=new Scanner(System.in);
        System.out.print("Gun yazınız = ");
        gun= oku.nextInt();
        System.out.print("Saat yazınız = ");
        saat=oku.nextInt();
        System.out.print("dakika yazınız = ");
        dk=oku.nextInt();

        int toplamSaniye=gun*Sabitler.gunSaat*Sabitler.saatDk*Sabitler.dksaniye
                +saat*Sabitler.saatDk*Sabitler.dksaniye+dk*Sabitler.dksaniye;
        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.Yöntem
        System.out.println("ToplamSaniye = "+Sabitler.hesapla(gun,saat,dk));


    }
}
