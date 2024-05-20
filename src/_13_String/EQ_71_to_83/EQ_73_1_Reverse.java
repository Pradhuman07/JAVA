package _13_String.EQ_71_to_83;
public class EQ_73_1_Reverse {
    public static void main(String[] args) {
        String s = "madame";
        String rev  = "";      //int rev = 0;

        for (int i=s.length()-1 ; i>=0  ; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}