package Gun45;

public class s10 {
    public static void main(String[] args) {
        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {
            for (String n : names){
                pwd[idx]=n.substring(2,6); // 2 dahil , 6 hariç alması
                System.out.println(pwd[idx]); // omas
                idx++;
            }
        }catch (Exception e)
        {
            System.out.println("Invalid Name");
        }
    }
}

// omas
// Invalid Name
