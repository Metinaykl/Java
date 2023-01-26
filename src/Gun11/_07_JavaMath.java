package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi 1 Giriniz = ");
        int sayi1=oku.nextInt();
        System.out.print("Sayi 2 Giriniz = ");
        int sayi2=oku.nextInt();
        System.out.print("Sayi 3 Giriniz = ");
        int sayi3=oku.nextInt();
        //1.Yöntem
        int enb=Math.max(sayi1,sayi2);
        enb=Math.max(enb,sayi3);
        System.out.println("enb = " + enb);

        //2.yöntem
        int enb2=Math.max(sayi1,Math.max(sayi2,sayi3));
        System.out.println("enb2 = " + enb2);

    }
}
