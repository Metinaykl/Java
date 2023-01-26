package Gun23;

import java.util.*;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer [] dizi=new Integer [10];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int) (Math.random()*11);

        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        //1. Yöntem
        HashSet<Integer> dizi2=new HashSet<>();
        for (int i = 0; i < dizi.length ; i++) {
            dizi2.add(dizi[i]);

        }
        System.out.println("dizi2 = " + dizi2);

        //2.Yöntem
        HashSet<Integer> dizi3=new HashSet<>(Arrays.asList(dizi));
        System.out.println("dizi3 = " + dizi3);

        //3.Yöntem
        HashSet<Integer>dizi4=new HashSet<>();
        Collections.addAll(dizi4,dizi);
        System.out.println("dizi4 = " + dizi4);

        }

        }
