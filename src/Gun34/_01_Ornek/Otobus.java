package Gun34._01_Ornek;

public class Otobus extends Arac {
    private int yolcuKapasitesi;

    public Otobus(String renk, int motorhacmi, String marka,int yolcuKapasitesi) {
        super(renk, motorhacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }
    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +
                "} " + super.toString();
    }
}
