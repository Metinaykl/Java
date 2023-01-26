package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3 tam karedir

        // 5 girildi , 5 e kadar olan sayiları birbiriyle çarpar
        // 9 girldi , 9 a kadar olan sayiları birbiriyle çarpar
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi = oku.nextInt();
        boolean bulundu=false;

        int sayac = 0;

        while (sayac < sayi) {
            System.out.println("sayac = " + sayac);

            if (sayac * sayac == sayi) {
                System.out.println("tam karedir");
                break; // çalıştığında döngüden çıkar
            }
            if (bulundu==false)
                System.out.println("tam kare değildir");

            sayac++;

        }
    }
}
