package Gun25._03_Soru;
import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci> snf =new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci Adı= "); ogr.adi=okuStr.nextLine();
            System.out.print("Öğrenci Soyadi= "); ogr.soyadi=okuStr.nextLine();
            System.out.print("Öğrenci Sinifi= "); ogr.sinifi=okuInt.nextInt();
            System.out.print("Öğrenci Adres= "); ogr.adres=okuStr.nextLine();

            snf.add(ogr);
        }

        for(Ogrenci o : snf)
        {
            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyadi = " + o.soyadi);
            System.out.println("o.sinifi = " + o.sinifi);
            System.out.println("o.adres = " + o.adres);
        }
    }
}
