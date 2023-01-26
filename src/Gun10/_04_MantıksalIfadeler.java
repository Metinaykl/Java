package Gun10;

import java.util.Scanner;

public class _04_MantıksalIfadeler {
    public static void main(String[] args) {

        // Mantıksal ifadeler
        //  &&  ve işaretimiz (shift-6)
        //  ||  veya işaretimiz ((altGr  <)


        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi =oku.nextInt();
        if (sayi%2==1 && sayi>0 ) {
            System.out.println("Uygun Sayi Girildi");
        }
        else {
            System.out.println("Uygun Sayi Girilmedi");
        }


        }
    }
