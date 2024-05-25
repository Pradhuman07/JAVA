package _13_String.Practise;
public class EQ_76_ChangeCase {
    public static void main(String[] args) {
        String str = "AcgFDu";
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                ans = ans + (char)(str.charAt(i)+32);
            else                                             //if(str.charAt(i)>='a' && str.charAt(i)<='z')
                ans = ans + (char)(str.charAt(i)-32);
        }

        System.out.println(ans);
    }
}
