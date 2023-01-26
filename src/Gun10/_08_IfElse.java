package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Boşluk Bırakarak Sayi Giriniz = ");
        String sayi=oku.nextLine();
        int boslukindex=sayi.indexOf(" ");
        int boslukindex1=sayi.lastIndexOf(" ");
        int sayi1=Integer.parseInt(sayi.substring(0,boslukindex));
        int sayi2=Integer.parseInt(sayi.substring(boslukindex+1,boslukindex1));
        int sayi3=Integer.parseInt(sayi.substring(boslukindex1+1));


        if ((sayi1+sayi2+sayi3) %2==0) {
            System.out.println("Çift");}
        else{
            System.out.println("Tek");}


        //int bos2index= sayi.indexOf(" ",boslukindex+1); //2.boşluğu aramaya verdiğin yerden sonra boşluğu bulur

    }
}
