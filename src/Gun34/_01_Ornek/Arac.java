package Gun34._01_Ornek;

public class Arac {

    private String renk;
    private int Motorhacmi;
    private String Marka;

    public Arac(String renk, int motorhacmi, String marka) {
        setRenk(renk);
        setMotorhacmi(motorhacmi);
        setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorhacmi() {
        return Motorhacmi;
    }

    public void setMotorhacmi(int motorhacmi) {
        Motorhacmi = motorhacmi;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", Motorhacmi=" + Motorhacmi +
                ", Marka='" + Marka + '\'' +
                '}';
    }
}
