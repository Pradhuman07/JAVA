package _12_String.Questions;
public class EQ_78_z2 {
    public static void main(String[] args) {
        String sentence = "Hello bhai kaise ho a";
        String[] arr = sentence.split(" ");
        String ans = "";

        for(String word : arr){
            char[] ch = word.toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            ans = ans + new String(ch) + " ";
        }

        System.out.println(ans.trim());
    }
}