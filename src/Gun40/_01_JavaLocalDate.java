package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate Sadece gun ay yıl bilgisini tutar.

        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // Kendisinden hazır formatlara bakalım

        System.out.println("ISO_DATE = "+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT
        )));
        System.out.println("MEDIUM = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM
        )));
        System.out.println("LONG = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG
        )));
        System.out.println("FULL = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL
        )));

        System.out.println("\n*****************************");
        // Localde aldığım tarihi istediğim ülkenin formatına gore, diline göre nasıl gösteriririm?
        // Örneğin localdeki saati ALmanyaya nasıl gösterebiliriz.

        System.out.println("FULL Almanya Gösterimi = \n"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        // Lokalizasyon tanımlaması

        //en-US : birincisi dili ikincisi ülkeyi temsil ediyor . Amerikan ingilizcesi
        //en-UK : UK ingilizcesi
        //fr-CA : Kanada Fransızcası
        //en-CA
        //tr-TR

        Locale[] kullanabilirLokaller=Locale.getAvailableLocales();
        for (Locale l : kullanabilirLokaller){
            if (l.getDisplayCountry().toLowerCase().contains("chi")){
                System.out.println("Dil = "+l.getDisplayLanguage());
                System.out.println(",Ülke = "+l.getDisplayCountry());
                System.out.println(", "+l.getLanguage());
                System.out.println(", "+l.getCountry());
            }
        }
        Locale lokalCince=new Locale("zh","CN");
        System.out.println("Full CİNCE Gösterimi" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("\n**************** İstediğim Formatta Gösterim **************** ");
        //istediğim formatta gösterim
        System.out.println("tarih"+tarih);
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy "+tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("tarih d/M/yy "+tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        System.out.println("tarih EEEE dd/MM/yyyy "+tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy "+tarih.format(oz4));


        System.out.println("Ozel format ve Loc EEEE dd.MM.yyyy"+tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy"+tarih.format(oz5));

        System.out.println("\n*****************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));
    }
}
