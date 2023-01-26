package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZoneDateTime {
    public static void main(String[] args) {

        // Başka zaman bölgelerinin (Time Zone) zaman bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        Set<String> zamanbolgeleri= ZoneId.getAvailableZoneIds();

        for (String z: zamanbolgeleri){
            if (z.toLowerCase().contains("ist")) // istanbul
                System.out.println("z = " + z);
        }
        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon=ZonedDateTime.now(zoneIdLondon);
        System.out.println("zoneLondon = " + zoneLondon);
    }
}
