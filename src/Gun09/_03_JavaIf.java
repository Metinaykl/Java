package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print(" ilk Sayiyi Giriniz = ");
        int sayi = oku.nextInt();

        System.out.print("İkinci Sayiyi Giriniz = ");
        int sayi2 = oku.nextInt();

        if (sayi > sayi2)
            System.out.println("Sayi Büyüktür"+sayi);

        if (sayi < sayi2)
            System.out.println("Sayi Küçüktür"+sayi);


        if (sayi == sayi2)
            System.out.println("Sayi Eşittir");



    }
}
