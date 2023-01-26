package Gun41;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        boolean sonraMi=buGun.isAfter(dun); // bugun dunden sonra mı
        System.out.println("sonraMi = " + sonraMi);
        boolean onceMi=buGun.isBefore(dun); // bugun dunden önce mi
        System.out.println("onceMi = " + onceMi);
        boolean esitMi=buGun.isEqual(dun); // bugun dün ile eşit mi
        System.out.println("esitMi = " + esitMi);
        boolean artikYilMi=buGun.isLeapYear(); // bugun artık yıl mi
        System.out.println("artikYilMi = " + artikYilMi);
        System.out.println("dun = " + dun);
    }
}
