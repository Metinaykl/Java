package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        //daha önce çözdüğünüz hesap makinesi sorusunu switch case ile çözünüz

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayiyi Girin = ");
        int sayi1=oku.nextInt();
        System.out.print("2.Sayiyi Girin = ");
        int sayi2=oku.nextInt();
        Scanner okuStr=new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi yazın Çıkarma=(Ç) Bölme=(B) Toplama=(T) Çarpma=(P) = ");
        String secim=okuStr.next();

        switch (secim.toUpperCase()) {
            case "T": System.out.println("toplam = " + (sayi1 + sayi2));break;
            case "Ç": System.out.println("Çıkarma = " + (sayi1 - sayi2));break;
            case "P": System.out.println("Çarpma = " + (sayi1 * sayi2));break;
            case "B": System.out.println("Bölme = " + (sayi1 / sayi2));break;
            default: System.out.println("Hatalı değer");
        }

    }
}
