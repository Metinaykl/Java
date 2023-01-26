package Gun37._02_Soru;

public class Shark implements IAnimal,ISailing{

    @Override
    public String food() {
        return "Köpekbalığı insan yiyebilir.";
    }

    @Override
    public String sail() {
        return "Köpek balığı yüzüyor kaçınnn!";
    }
}
