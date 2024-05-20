//81-Accept a string and print the frequency of each character present in the string
package _13_String.EQ_71_to_83;
public class EQ_81_Frequency {
    public static void main(String[] args) {
        String s = "orbhaikeseho";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) c++;
            }
            if (c > 0) System.out.println(ch + "->" + c);
        }
    }
}
//constraint - all lower case and no space
//very high TC