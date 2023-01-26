package Gun34._03_Ornek;

public class LiseOgrencisi extends Ogrenci {
   private String brans;
   public static int Liseidsayac=1;

    public LiseOgrencisi(String isim, OgrTipi tipi, String brans) {
        super(isim, tipi,Liseidsayac++);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return getId()+"\n"+"LiseOgrencisi{" +
                "klup='" + brans + '\'' +
                "} " +"\n"+ getIsim();
    }
}
