package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi=oku.nextInt();
        int kalan=sayi %2;
        if (kalan!=0)
            System.out.println("SAyi Tektir");
        if (kalan==0)
            System.out.println("Sayi Çifttir" );

    }
}
