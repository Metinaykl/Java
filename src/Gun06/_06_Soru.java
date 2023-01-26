package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadı "İsmet Temur" I.T şeklinde yazdınınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad soyad Giriniz=");
        String adsoyad=oku.nextLine(); // ad soyad veri olarak alındı

        //ismet temur ->I.T. ->I ->charat(0) I.
        //indexof (" ")->boşluğun indexini veriyor. bunun 1 fazlası charat() -> T yi verir

        char Ilkharf=adsoyad.charAt(0);
        int boslukIndex=adsoyad.indexOf(" ");
        char soyadilkharf=adsoyad.charAt(boslukIndex+1);
        System.out.println(Ilkharf+"."+soyadilkharf+".");

        //char soyadilkharf= adsoyad.charAt(adsoyad.indexof(" ")+1);

    }
}
