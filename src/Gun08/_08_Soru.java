package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi=oku.nextInt();
        int kalan=sayi %2;
        System.out.println("tek mi? = "+(kalan==1));

        //2.Yöntem
        System.out.println("tek mi? = "+(sayi %2==1));

        //3.Yöntem
        boolean tek=(sayi%2)==(1);
        System.out.println("tek = " + tek);

    }
}
