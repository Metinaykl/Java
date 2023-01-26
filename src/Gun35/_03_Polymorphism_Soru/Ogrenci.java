package Gun35._03_Polymorphism_Soru;

public class Ogrenci extends Muduriyet {
    private String subesi;


    public Ogrenci(String ad, String soyad, String gorevi,String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);

    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
