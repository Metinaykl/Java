package Gun38_Odev_Abstract.Soru4;

public class Circle extends Data{

    public Circle(int radius, int lenght, int widht) {
        super(radius, lenght, widht);
    }

    @Override
    public double getArea() {
        double area=pi*getRadius()*getRadius();
        return area;
    }
}
