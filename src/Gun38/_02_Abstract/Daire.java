package Gun38._02_Abstract;

public class Daire extends Sekil{

    private double yaricap;

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    @Override
    double Alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double Cevre() {
        return Math.PI*yaricap*2;
    }


}
