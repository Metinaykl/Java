package Departmanlar;

public class YonetimDepartmani implements Modeller.Departmanlar.Departman {

    final String departmanKodu = "YD";

    // Zam oranini belirlemeyi unutmayalim.
    final int zamOrani = 35;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
