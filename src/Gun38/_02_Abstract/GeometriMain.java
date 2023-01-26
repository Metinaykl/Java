package Gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("Yeni Dikdörtgen");
        d.Ciz();
        System.out.println(d);

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.Ciz();
        System.out.println(dr);

    }
}
