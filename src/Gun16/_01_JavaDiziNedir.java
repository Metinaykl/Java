package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        int ogrNot; // 1 tane saklar

        // 50 kişi var
        int ogr1not;
        int ogr2not;
        int ogr3not;
        //....
        //....
        //....
        int ogr50not;
        // bana bir tanımlamada BİRDEN FAZLA değer tutabilen bir değişken lazım
        // ÇÖZÜM
        int [] notlar =new int[50];
        notlar [0]=75;
        notlar [1]=88;
        // ....
        // ....
        notlar[49]=95; // en son eleman toplam eleman sayısından -1 length -1 dir böylece 0-49 index dir
        System.out.println("notlar[0] = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length); // 50 yani toplam eleman sayısını verir

        // diinin eleman sayısını verir
        // dizi nasıl okutulur
        Scanner oku=new Scanner(System.in);
        for (int i =0; i<notlar.length;i++) {
            System.out.print("Notu Giriniz = ");
            notlar[i] = oku.nextInt();
        }
        for (int i = 0; i<notlar.length; i++) {
            System.out.println(notlar[i]);
        }


    }
}
