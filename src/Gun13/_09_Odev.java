package Gun13;

import java.util.Scanner;

// Bir sayı bulmaca oyunu yapılmak isteniyor
//
//    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
//
//   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
//
//   bilemediniz yazıp tutulan sayıyı bildirsin.
//
//   Eğer bilirse tebrikler yazsın.

public class _09_Odev {
    public static void main(String[] args) {

        int sayac=0;
        int sayac2=0;

        while (sayac<100) {
            if (sayac % 10 == 5)
                sayac2++;
            sayac++;
        }
        System.out.println("sayac2 = " + sayac2);




    }}
