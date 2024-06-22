package _12_String.Questions;
public class EQ_76_2_Using_CharacterClass {
    public static void main(String[] args) {
        String str = "DcgMPup";
        String ans = "";

        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)) ans = ans + Character.toLowerCase(ch);
            else  ans = ans + Character.toUpperCase(ch);
        }

        System.out.println(ans);
    }
}