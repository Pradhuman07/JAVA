//77- Take an array of strings words and a String Prefix. Print the number of strings in words that contain pref as a prefix.
//Example - Input: words = ["pay","attention","practice","attend"], pref = "at"
//Output: 2

package _13_String.EQ_71_to_83;
public class EQ_77_Prefix {
    public static void main(String[] args) {
        String[] arr = {"pay","attention","practice","attend"};
        String prefix = "at";
        int count = 0;

        for(String word : arr){
            if(word.startsWith(prefix))        //direct "at" bhi daal skte th
                count++;
        }
        System.out.println(count);
    }
}
