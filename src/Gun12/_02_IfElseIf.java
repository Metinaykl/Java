package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayiyi Girin = ");
        int sayi1=oku.nextInt();
        System.out.print("2.Sayiyi Girin = ");
        int sayi2=oku.nextInt();
        Scanner okuStr=new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi yazın Çıkarma=(Ç) Bölme=(B) Toplama=(T) Çarpma=(P) = ");
        String secim=okuStr.next();

        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam = "+(sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Çıkarma = "+(sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Çarpma = "+(sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bölme = "+(sayi1/sayi2));
                    else
                        System.out.println("Yanlış Seçim yaptınız");


    }
}
