package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("kenar=" );
        int kenar= oku.nextInt();
        int cevre=kenar+kenar+kenar+kenar;
        System.out.println("cevre = " + cevre);
        int alan=kenar*kenar;
        System.out.println("alan = " + alan);


    }
}
