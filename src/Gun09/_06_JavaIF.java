package Gun09;

import java.util.Scanner;

public class _06_JavaIF {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle = oku.nextLine();

        if (cumle.contains("a"))
            System.out.println("EvET");
        if (!cumle.contains("a"))
            System.out.println("HAYIR");

        //2.Yol

        if (cumle.indexOf("a") != -1)
            System.out.println("EVET");
        if (cumle.indexOf("a") == -1)
            System.out.println("HAYIR");

        //3.yol
        boolean varMi=cumle.contains("a");
        if (varMi==true)
            System.out.println("EVET");
        if (varMi==false)
            System.out.println("HAYIR");



    }
}
