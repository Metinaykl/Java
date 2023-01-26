package Gun38_Odev_Abstract.Soru4;

public class Main {
    public static void main(String[] args) {
        Data circ=new Circle(3,5,6);
        Data rect=new Rectangle(4,5,6);
        System.out.println("circ.getArea() = " + circ.getArea());
        System.out.println("rect.getArea() = " + rect.getArea());
    }
}
