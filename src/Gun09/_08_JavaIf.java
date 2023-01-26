package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifrenizi Giriniz = ");
        String sifre=oku.nextLine();
        System.out.print("Tekrar Giriniz = ");
        String sifreony=oku.nextLine();
        boolean ayniMi=sifre.equals(sifreony);


        if (ayniMi==true)
            System.out.println("ŞİFRE EŞLEŞTİ");
        if (ayniMi==false)
            System.out.println("ŞİFRELER FARKLI");



    }
}
