package Gun21;

public class _11_Mentor {
    public static void main(String[] args) {
        // Ornek 4 : Verilen bir Array de tekrar eden elemanlari yazdirin...
        int [] numbers2 = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        System.out.println("Tekrar eden elemanlar");

        for (int i = 0; i < numbers2.length ; i++) {
            for (int j = i+1; j < numbers2.length ; j++) {
                if (numbers2[i]==numbers2[j]){
                    System.out.println(numbers2[i]);
                }
                
            }
            
        }
    }
}
