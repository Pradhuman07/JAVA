//81-Accept a string and print the frequency of each character present in the string
package _12_String.Questions;
public class EQ_80_Frequency {
    public static void main(String[] args) {
        String str = "orbhaikeseho";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) count++;
            }
            if (count > 0) System.out.println(ch + "->" + count);
        }

    }
}
//constraint - all lower case and no space
//very high TC