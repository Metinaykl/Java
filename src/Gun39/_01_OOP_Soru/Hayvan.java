package Gun39._01_OOP_Soru;

abstract public class Hayvan {
   private final int Id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    private static int countId=1;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.Id=countId++;
    }

    abstract void sesi();
    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();

    @Override
    public String toString() {
        System.out.print("yiyeceği="); yiyecegi();
        System.out.print("gunlukUykuSuresi="); gunlukUykuSuresi();
        System.out.print("yemekMiktari="); yemekMiktari();
        System.out.print("gunlukUykuSuresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();








        return "Hayvan{" +
                "Id=" + Id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

}
