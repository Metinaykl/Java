package Gun26._03_Ornek;

public class Rectangle {
    int width=5;
    int lenght=8;

    public void Cevre(){
        int cevre=(width+lenght)*2;
        System.out.println("Dikdörtgenin çevresi = "+cevre);

    }
    public void Alan (){
        int alan=width*lenght;
        System.out.println("Dikdörtgenin alanı = "+alan);
    }
}
