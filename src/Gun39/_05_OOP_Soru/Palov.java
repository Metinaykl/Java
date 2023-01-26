package Gun39._05_OOP_Soru;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Palov Afiyet Olsun!");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void fry() {
        System.out.println("Kızartıldı..");
    }

    void boil(){
        System.out.println("Haşlandı...");
    }
}
