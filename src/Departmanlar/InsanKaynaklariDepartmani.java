package Departmanlar;

public class InsanKaynaklariDepartmani implements Modeller.Departmanlar.Departman {

    final String departmanKodu = "IKD";

    // Zam oranini belirlemeyi unutmayalim.
    final int zamOrani = 20;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
