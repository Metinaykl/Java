package Mentor.Class;

public class UtlilityClass {
    public static int convertToInteger(String givenString){
        for (Character ch:givenString.toCharArray()){
            if (!Character.isDigit(ch))
                return -1;
        }
        return Integer.parseInt(givenString);
    }
}
