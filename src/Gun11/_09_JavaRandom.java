package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi Sınırı = ");
        int sayi=oku.nextInt();
        int tutulansayi= (int) (Math.random()*sayi);
        System.out.print("Tahmininiz = ");
        int tahmin=oku.nextInt();
        if (tahmin==tutulansayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Tekrar Deneyiniz" );


    }
}
