//79- Extend the prev question and capitalize first & last character of each word in the sentence and print the new sentence
//    Ex - Hello bhai Kaise ho a
//    oP -
//          HellO
//          BhaI
//          KaisE
//          HO
package _13_String.EQ_71_to_83;

public class EQ_79_ExtendOf78 {
    private static String capitalizeEachWord(String word) {
        char[] ch = word.toCharArray();
        ch[0] =  Character.toUpperCase(ch[0]);
        ch[ch.length-1] =  Character.toUpperCase(ch[ch.length-1]);

        return new String(ch);           //ch array ki new String bnai aur use return krdia..new keyword se
    }

    public static void main(String[] args) {
        String s = "Hello bhai kaise Ho";
        String[] words = s.split(" "); //makes an array of String type having elements = words
        for (String word : words) {
            System.out.println(capitalizeEachWord(word));    //hr ek word ko bari bari se ooper bhja jyega aur uss word ka 1st character ko capitalize kiya jyega
        }
    }
}
