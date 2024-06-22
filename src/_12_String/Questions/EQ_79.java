//79- Extend the prev question and capitalize first & last character of each word in the sentence and print the new sentence
//      Ex - Hello bhai Kaise ho a
//	    OP - HellO BhaI KaisE HO A
package _12_String.Questions;
public class EQ_79 {
    public static void main(String[] args) {
        String str = "Hello      bhai kaise ho a";
        String[] arr = str.split(" ");          //[Hello, , , , , , bhai, kaise, ho, a]
        String ans = "";

//      System.out.println(Arrays.toString(arr));  //see the empty elements..word.length()==0

        for(String word : arr) {
            if(word.length()==1)
                ans = ans + word.toUpperCase() + " ";
            if(word.length()>1)
                ans = ans +
                        Character.toUpperCase(word.charAt(0)) +
                        word.substring(1, word.length() - 1) +
                        Character.toUpperCase(word.charAt(word.length() - 1))
                        + " ";
        }
        System.out.println(ans.trim());
    }
}
