package Gun33._03_Inheritance;

public class Calisan {
    private String isim;
    private double maas;
    private double maasKatSayisi;

    public Calisan(String isim, double maas, double maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaaskatSayisi(maasKatSayisi);
    }
    public double maashesapla() {
        return maas * maasKatSayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaaskatSayisi() {
        return maasKatSayisi;
    }

    public void setMaaskatSayisi(double maaskatSayisi) {
        this.maasKatSayisi = maaskatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                "Ödenecek Maas="+maashesapla()+
                '}';
    }
}
