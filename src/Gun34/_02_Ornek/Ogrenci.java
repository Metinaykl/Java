package Gun34._02_Ornek;

public class Ogrenci {
    private final int id;
    private String isim;
    private OgrTipi tipi;
    private static int idSayac = 1;

    public Ogrenci(String isim, OgrTipi tipi) {
       setIsim(isim);
        setTipi(tipi);
        this.id = idSayac++;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTipi getTipi() {
        return tipi;
    }

    public void setTipi(OgrTipi tipi) {
        this.tipi = tipi;
    }
}