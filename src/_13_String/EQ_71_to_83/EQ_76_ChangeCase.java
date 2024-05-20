//In - AcgDfD
//Output - aCGdFd
package _13_String.EQ_71_to_83;
public class EQ_76_ChangeCase {
    public static void main(String[] args) {
        String s = "AcgDfD";
        String ans = "";

        for(char ch : s.toCharArray()){     //Remember for each loop is only for array so first convert string into character array
            if(ch>='A' && ch<='Z')
                ans = ans + (char)(ch+32);
            else
                ans = ans + (char)(ch-32);
        }
        System.out.println(ans);
    }
}
