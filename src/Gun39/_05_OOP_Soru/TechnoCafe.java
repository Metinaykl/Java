package Gun39._05_OOP_Soru;

import Gun39.MyFunct;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);

        ArrayList<IFood> siparisler=new ArrayList<>();



        int secim;

        do {
            menu();
            secim= okuInt.nextInt();

            switch (secim){
                case 1:
                    AdanaKebap a=new AdanaKebap();
                    siparisler.add(a);
                    break;
                case 2:
                    Lahmacun l=new Lahmacun();
                    siparisler.add(l);
                    break;
                case 3:
                    Borsh b=new Borsh();
                    siparisler.add(b);
                    break;
                case 4:
                    Palov p=new Palov();
                    siparisler.add(p);
                    break;
            }

        }while (secim<5);

        System.out.println("Alınan Siparişler...");
        for (IFood f : siparisler){
            System.out.println(f.getClass().getSimpleName());

        }

        System.out.println("Siparişler Hazırlanıyor...");
        MyFunct.Bekle(2);
        double toplamucret=0;
        for (IFood f : siparisler){
            TechnoKitchen.hazirla(f);
            toplamucret+=f.ucret();
            MyFunct.Bekle(2);

        }

        System.out.println("Toplam Ucret = " + toplamucret);



    }
    public static void menu(){
        System.out.print("Menü*\n" +
                "1-Adana Kebap (75 TL)\n" +
                "2-Lahmacun (20 TL)\n" +
                "3-Borsh (40 TL)\n" +
                "4-Palov (20 TL)\n" +
                "5-Tamam\n" +
                "Seçiminiz :");
    }
}
