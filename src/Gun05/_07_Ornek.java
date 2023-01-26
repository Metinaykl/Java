package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız
        // cevre=a+b+a+b alan=a*b

        Scanner oku=new Scanner(System.in);
        System.out.print("dikdortgen kısa kenarı=");
        int kisakenar= oku.nextInt();
        System.out.print("dikdörtgen uzun kenari");
        int uzunkenar= oku.nextInt();
        int cevre=uzunkenar+kisakenar+uzunkenar+kisakenar;
        int alan=uzunkenar*kisakenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);





    }
}
