package Gun38._02_Abstract;

abstract public class Sekil {
   private String name;

    public Sekil(String name) {
        setName(name);
    }

    protected Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double Alan();
   abstract double Cevre();

   public void Ciz(){
       System.out.println(name+"isimli şekil çizildi");
   }

    @Override
    public String toString() {
        return "Sekil" + "\n"+
                "name='" + name + '\'' + "\n"+
                "alan='" + Alan() + '\'' + "\n"+
                "cevre='" + Cevre() + '\'' ;
    }
}
