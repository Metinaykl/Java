package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Bir cümle giriniz=");
        String cumle=oku.nextLine();

        //01234 oda numaraları =


        int uzunluk=cumle.length();
        char s0nHarf=cumle.charAt(uzunluk-1);

        System.out.println("s0nHarf = " + s0nHarf);


        //2.Yöntem
        System.out.println("son Harf="+cumle.charAt(cumle.length()-1));





    }
}
