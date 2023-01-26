package Gun35._03_Polymorphism_Soru;

import Gun32._01_Encapsulation.Kisi;

public class Muduriyet {

    private String ad;
    private String soyad;
    private String gorevi;

    public Muduriyet(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public static void kimlikYaz(Muduriyet gelenkisi){
        System.out.println("Kimlik Belgesi Formu " + "\n"+
                "İsim: " + gelenkisi.getAd() + "\n" +
                "Soyisim: " + gelenkisi.getSoyad() + "\n" +
                "Görevi: " + gelenkisi.getGorevi());
        if (gelenkisi instanceof Ogrenci)
            System.out.println("Şubesi"+((Ogrenci)gelenkisi).getSubesi());
            else
                if (gelenkisi instanceof Calisan)
                    System.out.println("Departmanı"+((Calisan)gelenkisi).getDepartmani());
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Muduriyet{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
}
