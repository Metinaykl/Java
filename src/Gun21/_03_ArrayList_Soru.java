package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar=new ArrayList<>();
        Scanner okuint=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int toplam=0;
        String devamMi;
        do {
            //not girecek
            System.out.print("Not Giriniz = ");
            int not=okuint.nextInt();
            // notları arrayliste at
            notlar.add(not);
            //girilen notları topla
            toplam=toplam+not;
            //devam etmek istiyor musunuz? (E/H)
            System.out.print("Girmeye devam etmek istiyor musunuz? (E/H)");
            devamMi=okuStr.next();
        }while (devamMi.equalsIgnoreCase("E"));
        //ortalamayı bul

        int ort=toplam/notlar.size();
        //geçen sayısını bul
        System.out.println("ort = " + ort);
        int gecensayisi=0;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>ort)
                gecensayisi++;
            
        }
        System.out.println("gecensayisi = " + gecensayisi);
    }
}
