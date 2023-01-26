package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu Giriniz = ");
        int ogrNot=oku.nextInt();

        //1.yontem (önceki)

        if (ogrNot>=50)
            System.out.println("Geçtiniz");
        if (ogrNot<50)
            System.out.println("Kaldınız");

        //2.yontem doğru olan

        if (ogrNot>=50) { // her zaman tek bir kontrol yapar baklava dilimi gibi
            System.out.println("Gectiniz"); // evet
            System.out.println("tebrikler");
        }

            else {
            System.out.println("Kaldınız"); // hayır
        }

    }
}
