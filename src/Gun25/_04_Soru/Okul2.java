package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul2 {
    public static void main(String[] args) {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci2> sinif=new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            Ogrenci2 ogr=new Ogrenci2();
            System.out.print("Okul No = "); ogr.okulNo=okuInt.nextInt();
            System.out.print("Tam Adı = "); ogr.TamAd=okuStr.nextLine();
            System.out.print("Notu = "); ogr.Notu=okuInt.nextInt();

            sinif.add(ogr);

        }
        bilgileriYaz(sinif);
        ortalamaYaz(sinif);
    }
    public static void bilgileriYaz(ArrayList<Ogrenci2>sinif){
        for(Ogrenci2 ogr:sinif){
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.TamAd = " + ogr.TamAd);
            System.out.println("ogr.Notu = " + ogr.Notu);
        }

    }
    public static void ortalamaYaz(ArrayList<Ogrenci2>sinif){
        int toplam=0;
        for(Ogrenci2 ogr:sinif){
            toplam =toplam+ogr.Notu;

        }
        System.out.println("ort = "+(toplam/sinif.size()));

    }
}
