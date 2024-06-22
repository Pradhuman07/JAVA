package _12_String.Questions;
public class EQ_79_z2_Best {
    public static void main(String[] args) {
        String sentence = "Hello     bhai kaise ho a";
        String[] arr = sentence.split(" ");
        String ans = "";

        for(String word : arr)
            if(word.length()>0){
                char[] ch = word.toCharArray();
                ch[0] = Character.toUpperCase(ch[0]);
                ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);
                ans = ans + new String(ch) + " ";
            }

        System.out.println(ans.trim());
    }
}