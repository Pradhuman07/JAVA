//78- Accept a space seperated sentence and split in into words. Print each word on a new line with first letter capitalized.
//      IN-      Hello bhai kaise ho
//      OP-        Hello
//                 Bhai
//                 Kaise
//                 Ho
package _13_String.EQ_71_to_83;

public class EQ_78_AllWordSeparateLine {
    private static String capitalizeEachWord(String word) {
        char[] ch = word.toCharArray();
        if(ch[0]>='a' && ch[0]<='z')
            ch[0] = (char)(ch[0]-32);
        return new String(ch);           //ch array ki new String bnai aur use return krdia..new keyword se
    }
    public static void main(String[] args) {
        String s = "Hello bhai kaise Ho";
        String[] words = s.split(" "); //makes an array of String type having elements = words
        for(String word : words){
            System.out.println(capitalizeEachWord(word));    //hr ek word ko bari bari se ooper bhja jyega aur uss word ka 1st character ko capitalize kiya jyega
        }

    }
}