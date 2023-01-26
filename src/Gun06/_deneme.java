package Gun06;

import java.util.Scanner;

public class _deneme {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad soyad Giriniz = ");
        String adsoyad=oku.nextLine();
        char ilkharf=adsoyad.charAt(0);
        int bosluk=adsoyad.indexOf(" ");
        char soyadilkharf=adsoyad.charAt(bosluk+1);
        System.out.println(ilkharf+"."+soyadilkharf+".");







    }
}
