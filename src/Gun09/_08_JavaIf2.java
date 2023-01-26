package Gun09;

import java.util.Scanner;

public class _08_JavaIf2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Şifrenizi Giriniz = ");
        String sifre=oku.nextLine();
        System.out.print("Tekrar Giriniz = ");
        String sifreony=oku.nextLine();

        if (sifre==sifreony)
            System.out.println("AYNI");
        if (sifre!=sifreony)
            System.out.println("DEĞİL");
    }
}
