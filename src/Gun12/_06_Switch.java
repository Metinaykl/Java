package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {

        //Girilen bir sayinin birler basamağının değerini yazı ile yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz  = ");
        int sayi=oku.nextInt();
        int birlerbasamagi=sayi%10; //modül her zaman kalanı verir //sayi/10%10 ortadaki sayi sayi/100%10 baştaki sayi

        switch (birlerbasamagi) {
            case 0: System.out.println("sıfır");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
        }
        }


}
