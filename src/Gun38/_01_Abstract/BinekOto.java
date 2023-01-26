package Gun38._01_Abstract;

//2 si bir arada => interface +1 parent class = abstract class

abstract public class BinekOto {
    private String marka;
    private int uretimYili;
    private int VitesAdedi;

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }
    abstract int HizlanmaSuresi();

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return VitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        VitesAdedi = vitesAdedi;
    }
}
