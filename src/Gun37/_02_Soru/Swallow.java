package Gun37._02_Soru;

public class Swallow implements IAnimal,IFlying{

    @Override
    public String food() {
        return "Kırlangıç uçan böcekleri yedi.";
    }

    @Override
    public String fly() {
        return "Uçtu uçtu kırlangıç uçtu.";
    }
}
