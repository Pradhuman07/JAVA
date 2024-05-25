//Count vowels and consonants in a string
package _13_String.Practise;
public class EQ_75_VowelsAndCons {
    public static void main(String[] args) {
        String str = "HelloBuddy";

        int vc=0 , cc=0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'a','e','i','o','u' -> vc++;
                default -> cc++;
            }
        }

        System.out.println(vc);
        System.out.println(cc);
    }
}
