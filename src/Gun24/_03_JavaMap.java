package Gun24;

import java.util.*;

public class _03_JavaMap {
    public static void main(String[] args) {
       // bir kartvizit uygulamasını 2 kişi için yapınız

        HashMap<String,String > uKartvizit=new HashMap<>();
        uKartvizit.put("isim","Uğur yılmaz");
        uKartvizit.put("email","uğur@gmail.com");
        uKartvizit.put("adres","ÇekmeKöy/İstanbul");
        uKartvizit.put("telefon","05050550505");

        System.out.println("uKartvizit.get(isim) = " + uKartvizit.get("isim"));
        System.out.println("uKartvizit.get(telefon) = " + uKartvizit.get("telefon"));

        HashMap<String ,String > aKartVizit=new HashMap<>();
        aKartVizit.put("isim","Ayşe Bayrak");
        aKartVizit.put("email","ayse@gmail.com");
        aKartVizit.put("adres","Şişli/istanbul");
        aKartVizit.put("telefon","05323223232");

        List<String> accounts = new ArrayList<>(Arrays.asList("1234", "5678"));
        List<String> accounts2 = new ArrayList<>(Arrays.asList("4321", "8765"));
        ArrayList<String> musteriler=new ArrayList<>();
        musteriler.add(accounts.toString());
        musteriler.add(accounts2.toString());
        System.out.println("ses"+musteriler);
        HashMap<String,HashMap<String ,String >> kartvizitler=new HashMap<>();
        kartvizitler.put("ugur",uKartvizit);
        kartvizitler.put("ayse",aKartVizit);

        System.out.println("kartvizitler.get(ugur) = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(ayse) = " + kartvizitler.get("ayse"));
        System.out.println("Ayşenin Adresi = " + kartvizitler.get("ayse").get("adres"));

        // sadece emailler

        for(Map.Entry<String,HashMap<String ,String >>kv:kartvizitler.entrySet()) {
            System.out.println("Emailler = " + kv.getValue().get("email"));
            }
        }


    }
