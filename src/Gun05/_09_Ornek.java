package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("kilonuzu yazınız=");
        double agirlik = oku.nextDouble();

        System.out.print("boyunuzu yazınız=");
        double boy = oku.nextDouble();

        double kitleindeks=agirlik/ (boy*boy);
        System.out.println("boyunuz="+boy+", kilonuz="+agirlik);
        System.out.println("kitleindeks = " + kitleindeks);






    }
}
