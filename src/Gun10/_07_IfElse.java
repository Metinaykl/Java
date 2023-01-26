package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayilari bir boşluk bırakarak Giriniz = ");
        String sayi=oku.nextLine();
        int boslukIndex=sayi.indexOf(" ");
        String strsayi1=sayi.substring(0,boslukIndex);
        String strsayi2=sayi.substring(boslukIndex+1);
        int sayi1=Integer.parseInt(strsayi1);
        int sayi2=Integer.parseInt(strsayi2);

        if (sayi1==sayi2)
            System.out.println("Eşit");
        else
            System.out.println("Değil");


    }
}
