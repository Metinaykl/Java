package Gun05;

import java.util.Scanner;

public class _Odev_02 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("İsminizi yazınız=");
        String isminiz=oku.next();
        System.out.println("isminiz = " + isminiz);

        Scanner okuint=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=okuint.nextInt();
        System.out.println("sayi = " + sayi);

        System.out.print("sevdiğiniz meyveyi yazınız=");
        String meyve=oku.next();
        System.out.println("meyve = " + meyve);

        System.out.print("arabadaki kapı sayısını yazınız=");
        int kapi=okuint.nextInt();
        System.out.println("kapi = " + kapi);

        System.out.print("10 sene önce yaşadığınız şehir=");
        String sehir=oku.next();
        System.out.println("sehir = " + sehir);

        System.out.print("doğum tarihinizi yazınız=");
        String dogum=oku.next();
        System.out.println("dogum = " + dogum);


        Scanner okuboolean=new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var Mı?=");
        boolean banka=okuboolean.hasNext();
        boolean varIse=true;
        System.out.println("varIse = " + banka);


        Scanner okubyte=new Scanner(System.in);
        System.out.print("kilonuzu yazınız=");
        byte agirlik=okubyte.nextByte();
        System.out.println("agirlik = " + agirlik);

        Scanner okufloat=new Scanner(System.in);
        System.out.print("boyunuzu yaziniz=");
        float boy=okufloat.nextFloat();
        System.out.println("boy = " + boy);











    }
}
