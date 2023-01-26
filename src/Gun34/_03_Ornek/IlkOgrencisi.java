package Gun34._03_Ornek;

public class IlkOgrencisi extends Ogrenci {
    private String klup;
    public static int ilkidsayac=1;

    public IlkOgrencisi(String isim, OgrTipi tipi, String klup) {
        super(isim, tipi,ilkidsayac++);
        setKlup(klup);

    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return getId()+"\n"+"IlkOgrencisi{" +
                "klup='" + klup + '\'' +
                "} " +"\n"+ getIsim();
    }
}
