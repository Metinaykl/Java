package Gun29.MentorMethod;

import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
        // Method Soru 1 - TODO Bir String de tum sesli harfleri sayan bir method yaziniz....

        System.out.println(sesli());

    }

    public static String sesli (){

        int sayac=0;
        String metin;
        String sesliler="aeıioöuü";
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime girin");
        metin = scan.nextLine();
        for(int i = 0 ; i<=metin.length()-1;i++)
        {
            for(int j= 0 ; j<=7;j++)
            {
                if(metin.charAt(i)==sesliler.charAt(j))
                {
                    sayac++;
                }

            }

        }

        System.out.println("Sesli Harfler= " + sayac);
        return metin;

    }

}


