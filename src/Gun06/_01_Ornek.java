package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
// Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde Giriniz = ");
        String cadde= oku.nextLine();
        System.out.print("Sokak giriniz = ");
        String sokak=oku.nextLine();
        Scanner okuint=new Scanner(System.in);
        System.out.print("Postcode Giriniz = ");
        int postcode=okuint.nextInt();
        System.out.print("Ülkenizi Giriniz = ");
        String ulke=oku.nextLine();
        System.out.println("Adres = "+cadde+" "+sokak+" "+postcode+" "+ulke);












    }
}
