package Gun34._03_Ornek;

public class Ogrenci {
    private final int id;
    private String isim;
    private OgrTipi tipi;

    public Ogrenci(String isim, OgrTipi tipi,int id) {
       setIsim(isim);
        setTipi(tipi);
        this.id =id;
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