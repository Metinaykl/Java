package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {

        // Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Ay Numarasını Giriniz = ");
        int ay = oku.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            case 2:
                System.out.println("Gün Sayisi 28 Gün");
                break;
            case 3:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            case 4:
                System.out.println("Gün Sayisi 30 Gün");
                break;
            case 5:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            case 6:
                System.out.println("Gün Sayisi 30 Gün");
                break;
            case 7:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            case 8:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            case 9:
                System.out.println("Gün Sayisi 30 Gün");
                break;
            case 10:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            case 11:
                System.out.println("Gün Sayisi 30 Gün");
                break;
            case 12:
                System.out.println("Gün Sayisi 31 Gün");
                break;
            default:
                System.out.println("Yanlış Ay Numarası Girdiniz ");}


                switch (ay) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: System.out.println("Gün Sayisi 31 Gün");break;

                    case 2: System.out.println("Gün Sayisi 28 Gün");break;

                    case 4:
                    case 6:
                    case 9:
                    case 11: System.out.println("Gün Sayisi 30 Gün");break;

                    default:
                        System.out.println("Yanlış Ay Numarası Girdiniz ");}


        }
    }
