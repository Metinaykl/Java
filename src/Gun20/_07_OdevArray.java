package Gun20;

import Gun06._deneme;

import java.util.Scanner;

public class _07_OdevArray {
    public static void main(String[] args) {

        EvenOddNums("");



    }
    public static int EvenOddNums (String sayi){
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz = ");
        long rkm=oku.nextLong();
        long adet=0;
        long toplam=0;
        while (rkm!=0)
        {
            if (rkm%2==0)
                toplam = (rkm % 10) + toplam;
                rkm /= 10;
                ++adet;
            if (rkm%2==1)
                toplam=toplam-(rkm%10);
            }
            {

        }
        System.out.println("Basamakların Sonucu = " + toplam);


        return (int) rkm;
    }
}
