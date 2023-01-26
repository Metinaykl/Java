package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad="Metin"; // String : kelime veya kelimeleri saklamak icin kullanılır
        // sınırlarını " " ile belirlenir

        String soyad="Aykul";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad =" +ad+ "\t"+soyad);
        // + lar burada stringler arasında olanı birleştirir

        String tamAd= "Metin" +" " + "Aykul";
        System.out.println("tamAd = " + tamAd);

    }
}
