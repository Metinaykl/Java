package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız

        Scanner oku =new Scanner(System.in);
        System.out.print("sayi1=");
        int tamsayi1= oku.nextInt();
        System.out.print("sayi2=");
        int tamsayi2=oku.nextInt();
        int toplam=tamsayi1+tamsayi2;
        System.out.println("toplam = " + toplam);

    }
}
