package Gun37._02_Soru;

import java.util.ArrayList;
import java.util.Arrays;

public class HayvanlarMain {
    public static void main(String[] args) {

        Cat cat =new Cat();
        Duck duck=new Duck();
        Shark shark=new Shark();
        Swallow swallow=new Swallow();
        ArrayList<IAnimal> anim=new ArrayList<>(Arrays.asList(cat,duck,shark,swallow));

        for (IAnimal a:anim){
            System.out.println("-------------------------------");
            System.out.println(a.getClass().getSimpleName());
            System.out.println("-------------------------------");
            if (a instanceof Cat) {
                System.out.println(a.food());
            }
            else
                if (a instanceof Duck){
                    System.out.println(a.food());
                    System.out.println(((Duck) a).fly());
                    System.out.println(((Duck) a).sail());
                }
                else
                    if (a instanceof Shark){
                        System.out.println(a.food());
                        System.out.println(((Shark) a).sail());
                    }
                    else
                        if (a instanceof Swallow){
                            System.out.println(a.food());
                            System.out.println(((Swallow) a).fly());
                        }
            }

    }
}
