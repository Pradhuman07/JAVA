package _12_String.Questions;
public class EQ_76_2_Using_CharacterClass {
    public static void main(String[] args) {
        String str = "DcgMPup";
        String ans = "";

        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)) ans = ans + Character.toLowerCase(c);
            else  ans = ans + Character.toUpperCase(c);
        }

        System.out.println(ans);
    }
}