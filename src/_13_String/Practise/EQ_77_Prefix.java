package _13_String.Practise;
public class EQ_77_Prefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        int count=0;

        for(String str : words){
            if(str.startsWith("at")) count++;       //"at" ki jgah prefix bhi dal skte th but phle String prefix = "at"; declare krna pdta
        }

        System.out.println(count);
    }
}

//Take an array of strings words and a String Prefix.
//Print the number of strings in words that contain pref as a prefix.
//Example:- Input: words = ["pay","attention","practice","attend"], pref = "at"
//          Output: 2