package Gun09;

import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.Locale;
import java.util.Scanner;

public class _07_javaIf {
    public static void main(String[] args) {

        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        cumle=cumle.toLowerCase();

        if (cumle.contains("a"))
            System.out.println("VAR");
        if (!cumle.contains("a"))
            System.out.println("YOK");

        //2.Yol

        if (cumle.indexOf("a") != -1)
            System.out.println("VAR");
        if (cumle.indexOf("a") == -1)
            System.out.println("YOK");

        //3.yol
        boolean varMi=cumle.contains("a");
        if (varMi==true)
            System.out.println("VAR");
        if (varMi==false)
            System.out.println("YOK");
    }
}
