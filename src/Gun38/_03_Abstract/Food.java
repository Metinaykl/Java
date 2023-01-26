package Gun38._03_Abstract;

abstract public class Food {
    private String name;
    abstract void madeIn();
    abstract void taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
