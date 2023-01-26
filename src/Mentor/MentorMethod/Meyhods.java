package Gun29.MentorMethod;

import java.util.Scanner;

public class Meyhods {
    public static void main(String[] args) {

        System.out.println("sonuc="+hesapMakinesi(sayiGir(),sayiGir(),islemGir()));

    }

    public static double hesapMakinesi(double a,double b,String islem){

        switch (islem){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                System.out.println("Yanlış Giriş Yaptınız");
        }
        return 0;


    }
    public static double sayiGir (){
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        double sayi= oku.nextDouble();
        return sayi;
    }

    public static String islemGir(){
        Scanner oku=new Scanner(System.in);
        System.out.println("İşlem Giriniz");
        String str= oku.nextLine();

        return str;
    }
}
