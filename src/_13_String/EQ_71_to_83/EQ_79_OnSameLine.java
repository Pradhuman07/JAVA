//79- Extend the prev question and capitalize first & last character of each word in the sentence and print the new sentence
//    Ex - Hello bhai Kaise ho
//    oP - HellO BhaI KaisE HO
package _13_String.EQ_71_to_83;

public class EQ_79_OnSameLine {
    private static String capitalizeEachWord(String word) {
//        if(word.length() <=2) return word.toUpperCase();   //not needed ab kyoki we have added line 21
        char[] ch = word.toCharArray();
        ch[0] =  Character.toUpperCase(ch[0]);
        ch[ch.length-1] =  Character.toUpperCase(ch[ch.length-1]);

        return new String(ch);           //ch array ki new String bnai aur use return krdia..new keyword se
    }

    public static void main(String[] args) {
        String s = "Hello  bhai kaise Ho";
        String[] words = s.split(" "); //makes an array of String type having elements = words
        String ans = "";
        for (String word : words) {
            if(word.length()>0){    //remove extra space
                ans = ans + capitalizeEachWord(word) + " ";    //saare words me se space hata dia tha na line no.23
            }
        }
        System.out.println(ans.trim());   //.trim to remove last ka space
    }
}

//note tum chahte to extend of 78 mein hi soutprint (cap) krskte th but wo bss printiing horhi hoti
//            System.out.print(capitalizeEachWord(word) + " ");