package _12_String.Questions;
public class EQ_79_z3 {

    private static String capitalizeEachWord(String word) {
        char[] ch = word.toCharArray();
        ch[0] =  Character.toUpperCase(ch[0]);
        ch[ch.length-1] =  Character.toUpperCase(ch[ch.length-1]);
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Hello      bhai kaise Ho a";
        String[] words = s.split(" ");
        String ans = "";

        for (String word : words)
            if(word.length()>0) ans = ans + capitalizeEachWord(word) + " ";

        System.out.println(ans.trim());
    }
}