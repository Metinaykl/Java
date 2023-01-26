package Gun07;

import Gun01.Merhaba;

public class _01_StringEquals {
    public static void main(String[] args) {
        //equals : 2 stringin birbirine eşit olup olmadığını kontrol eder
        //sonuc boolean





        String s1="Merhaba";
        String s2= "NERHABA";

        boolean esitmi=s1.equals(s2); // s1 eşit mi s2ye Merhaba MERHABA
        System.out.println("esitmi = " + esitmi);

        System.out.println("s1.equals(s2)="+s1.equals(s2)); // Merhaba MERHABA
        System.out.println("s1.equals(Merhaba)="+s1.equals("Merhaba")); // Merhaba Merhaba

    }
}
