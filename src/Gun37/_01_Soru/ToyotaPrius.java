package Gun37._01_Soru;

public class ToyotaPrius extends Vehicle implements IElectric,IGas {


    public ToyotaPrius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Ömür Boyu Kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "auto pilot özelliği var";
    }
}
