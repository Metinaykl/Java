package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try {

            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkharf=str.charAt(0);
            System.out.println("hatadan sonraki kısım");

            // hata olma olasılığın olduğu kodlar
        }
        catch (Exception ex){

            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        }
        finally // hata olsada çalışır , olmasada çalışcak kısım , bu bölümün yukarıdaki süreçle
                // olduğunu göstermek için finally içinde yazılır
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try catch bloğuyla ilgili son yapılacaklar ");

        }

        System.out.println("diğer çalışan kodlar");
        System.out.println("program sonu");










    }
}
