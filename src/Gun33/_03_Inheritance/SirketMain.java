package Gun33._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Ahmet", 8000, 1.2);
        GenelMudur genelMudur = new GenelMudur("Mehmet", 12000, 1.8, 1000);
        System.out.println("Bordro");
        System.out.println("-------------------");
        System.out.println(calisan);
        System.out.println(genelMudur);
    }
}
