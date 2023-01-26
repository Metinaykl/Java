package Gun37._01_Soru;

public class BusDiesel extends Vehicle implements IDeisel {

    public BusDiesel(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDeisel() {
        return "1 depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "en fazla 90km hız yapabilir ";
    }
}
