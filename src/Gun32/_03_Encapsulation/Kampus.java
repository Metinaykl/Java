package Gun32._03_Encapsulation;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu", 3); // maxOgr 3

        do {
            System.out.print("Öğrenci adı: ");
            String ad = okuStr.nextLine();
            System.out.print("Öğrenci soyadı: ");
            String soyad = okuStr.nextLine();
            System.out.print("Öğrenci yaşı: ");
            int yas = okuInt.nextInt();
            Ogrenci ogrenci = new Ogrenci(ad, soyad, yas);
            Okul.ogrenciEkle(ogrenci);


            

        }while(yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan());

        for(Ogrenci ogr:yeniOkul.getOgrenciler()){
            System.out.println("ogr = " + ogr);
        }



    }
}
