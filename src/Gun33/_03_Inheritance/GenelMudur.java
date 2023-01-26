package Gun33._03_Inheritance;

public class GenelMudur extends Calisan {
    private double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public double maashesapla() {
        return super.maashesapla()+getTazminat();
    }

    @Override
    public String toString() {
        return "GenelMudur{" + " "+
                "isim=" +" "+getIsim()+ '\''+
                "maas"+getMaas()+
                "maaskatsayisi"+getMaaskatSayisi()+
                "Ödenecek Maas"+maashesapla()+
                "tazminat=" + getTazminat() +
                '}';
    }
}

