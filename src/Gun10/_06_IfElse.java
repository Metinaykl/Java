package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre Giriniz = ");
        String sifre=oku.nextLine();

        boolean varMi=sifre.contains("pass");

        if (sifre.length()>=8 && sifre.length()<=12 && varMi==false ) {
            System.out.println("Başarılı");
        }
            else {
            System.out.println("Kuralları Okuyunuz");
        }

            //2.Yöntem
        if (sifre.length()>=8 && sifre.length()<=12&&sifre.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("uygun değil");

        //3.Yöntem
        if (sifre.length()>=8 && sifre.length()<=12&& !sifre.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println();
        System.out.println("uygun değil");

        }
    }
