package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru_tam_cozum {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int[] dizi=new int[10];
        for (int i = 0; i < dizi.length ; i++) // 10 elamanlı bir diziyi random [10 dahil] sayi verir
        {
            dizi [i]=(int) (Math.random()*11);


        }
        System.out.println(Arrays.toString(dizi));
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Rakam Giriniz (0-10)=");
        int arananrkm=oku.nextInt();
        boolean bulundu=false;
        for (int i = 0; i <dizi.length; i++) // bir rakamı arattırdınız
        {
            if (dizi[i] == arananrkm) {
                bulundu=true;
                System.out.println("Bulundu index="+i);

            }

        }
        if (!bulundu){
            System.out.println("Bulunamadı");
        }
    }
}
