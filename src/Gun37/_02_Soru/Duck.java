package Gun37._02_Soru;

public class Duck implements IAnimal,IFlying,ISailing{

    @Override
    public String food() {
        return "Ördek kuru ekmek yiyor yazık.";
    }

    @Override
    public String fly() {
        return "Ördek göl boyunca uçtu,hani uçmazdı.";
    }

    @Override
    public String sail() {
        return "Bak ördek yüzüyor.";
    }
}
