package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi=oku.nextInt();
        int kalan=sayi %2;
        if (kalan==0)
            System.out.println("SAyi Tektir");
        else
            System.out.println("Sayi Çifttir" );

    }
}

