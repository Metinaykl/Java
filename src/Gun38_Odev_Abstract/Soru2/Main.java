package Gun38_Odev_Abstract.Soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int sayi1,sayi2;
            System.out.print("ilk sayiyi giriniz = ");
            sayi1=scan.nextInt();
            System.out.print("2.sayiyi giriniz = ");
            sayi2=scan.nextInt();
            Sum sum=new Sum();
            sum.calculating(sayi1,sayi2);
            System.out.println("toplama sonuc = "+sum.calculating(sayi1,sayi2));
            Divide divide=new Divide();
            divide.calculating(sayi1,sayi2);
            System.out.println("bölme sonuc = "+divide.calculating(sayi1,sayi2));
            Multiply multiply=new Multiply();
            multiply.calculating(sayi1,sayi2);
            System.out.println("çarpma sonuc = "+multiply.calculating(sayi1,sayi2));
            Substract substract=new Substract();
            substract.calculating(sayi1,sayi2);
            System.out.println("çıkarma sonuç = "+substract.calculating(sayi1,sayi2));




    }
}
