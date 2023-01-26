package Gun38_Odev_Abstract.Soru4;

abstract public class Data {
    final double pi=Math.PI;
    private int radius;
    private int lenght;
    private int widht;

    public Data(int radius, int lenght, int widht) {
        setRadius(radius);
        setLenght(lenght);
        setWidht(widht);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }



    abstract public double getArea();
}
