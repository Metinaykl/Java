package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Vize Notunuzu Giriniz = ");
        double vize=oku.nextDouble();
        System.out.print("Final Notunuzu Giriniz = ");
        double Final=oku.nextDouble();
        // ondalık sonuç verecek yada ondalık sayı girilecekse double kullan

        if ((vize/2)+(Final/2)>=60) {
            System.out.println("Geçtiniz Tebrikler = "+(vize/2+Final/2));
        }
        else {
            System.out.println("Bütünlemeye Kaldınız = "+(vize/2+Final/2));
        }



    }
}
