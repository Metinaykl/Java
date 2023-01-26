package Gun04;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)


        double kilo=90.0;
        int boy=183;
        double kitleendeks=kilo / (boy*boy);
        System.out.println("kitleendeks = " + kitleendeks);
        System.out.println("boyunuz="+boy+", kilonuz="+kilo);

        //*****************************************************//
        double boy2=1.83;
        double kitleendeks2=kilo / (boy2*boy2);
        System.out.println("kitleendeks2 = " + kitleendeks2);

    }
}
