package Gun38_Odev_Abstract.Soru4;

public class Rectangle extends Data{

    public Rectangle(int radius, int lenght, int widht) {
        super(radius, lenght, widht);
    }

    @Override
    public double getArea() {
        double rectaarea=getLenght()*getWidht();

        return rectaarea;
    }
}
