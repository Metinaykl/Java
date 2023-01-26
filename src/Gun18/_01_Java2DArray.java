package Gun18;

import java.util.Scanner;

public class _01_Java2DArray {
    public static void main(String[] args) {
        int sayi=0; // 1 sayi
        int [] dizi=new int[100]; // 100 sayi

        int []ders1Notlari=new int[50];
        int []ders2notlari=new int[50];
        int []ders3notlari=new int[50];

        int [][] tumdersnotlari=new int[3][50]; //3 tane ders 50 tane öğrenci notu
                                                //3 satr 50 sütün
                                                //her satır 50 tane sayi,50 sütun
                                                //0.satır,1.satır,2.satır
                                                //satır: 0,1,2 sütün: 0,1,2,3,....49


        ders1Notlari[0]=80; // tek boyutlu dizinin ilk(0) elemanına 80 değerini atadım
        tumdersnotlari[0][0]=80; // 2 boyutlu dizide 0.satırın,0.sutununa 80 değeri atadım.

        System.out.println("tumdersnotları"+tumdersnotlari[0][0]);
        Scanner oku=new Scanner(System.in);
        tumdersnotlari[0][0]=oku.nextInt();
    }
}
