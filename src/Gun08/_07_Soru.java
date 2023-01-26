package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz = ");
        int sayi=oku.nextInt();
        System.out.print("2.Sayiyi giriniz = ");
        int sayi2=oku.nextInt();
        System.out.println("Sayilar eşit mi? = "+(sayi==sayi2));

        //2.yöntem
        boolean esitMi=(sayi==sayi2);
        System.out.println("esitMi = " + esitMi);


    }
}
