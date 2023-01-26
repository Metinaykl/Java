package Gun36._06_Ornek;

public class Dikdortgen implements IYapi{

    @Override
    public double cevresi(double kisakenar, double uzunkenar) {
        return kisakenar*uzunkenar;

    }

    @Override
    public double alani(double kisakenar, double uzunkenar) {
        return(kisakenar+uzunkenar)*2;

    }
}
