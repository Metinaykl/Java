package Gun39._05_OOP_Soru;

public class TechnoKitchen {

    public static void hazirla(IFood food) {
        System.out.println(food.getClass().getSimpleName());
        if (food instanceof AdanaKebap) {
            ((AdanaKebap) food).marinade();
            ((AdanaKebap) food).grill();
        } else if (food instanceof Lahmacun) {
            ((Lahmacun) food).dough();
            ((Lahmacun) food).addMeat();
            ((Lahmacun) food).bake();
        } else if (food instanceof Borsh) {
            ((Borsh) food).boil();
            ((Borsh) food).eatTomorrow();
        } else if (food instanceof Palov) {
            ((Palov) food).fry();
            ((Palov) food).boil();
        }
        food.taste();
        System.out.println();
    }
}
