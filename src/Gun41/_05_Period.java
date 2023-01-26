package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1993,5,8);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+ " Yaşındasınız ");
        /**************************************************/

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);
        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);
        LocalDate ucgunsonra=bugun.plus(period3Gun);
        System.out.println("ucgunsonra = " + ucgunsonra);
        LocalDate ucaysonra=bugun.plus(period3Ay);
        System.out.println("ucaysonra = " + ucaysonra);

        /******************************************************/
        //Kursun bitiş tarihini bulunuz 6 ay- 31 Ekim 2022
        LocalDate kurbaslangic=LocalDate.of(2022,10,31);
        Period kurssure=Period.ofMonths(6);
        LocalDate kursbitis=kurbaslangic.plus(kurssure);

        System.out.println("kursbitis = " + kursbitis);
        System.out.println("getDayOfWeek() = " + kursbitis.getDayOfWeek());

        // kursun bitmesine ne kadar kaldı
        Period nekadarsurekaldi=Period.between(bugun,kursbitis);
        System.out.println("nekadarsurekaldi = " + nekadarsurekaldi);

        // Kurs ne kadar süredir devam ediyor
        Period suanakadarDevamSuresi=Period.between(kurbaslangic,bugun);
        System.out.println("suanakadarDevamSuresi = " + suanakadarDevamSuresi);

    }
}
