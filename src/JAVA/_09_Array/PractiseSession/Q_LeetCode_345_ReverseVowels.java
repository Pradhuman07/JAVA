package JAVA._09_Array.PractiseSession;

public class Q_LeetCode_345_ReverseVowels {
    static boolean isVowel(char ch){
        switch (ch){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public static String reverseVowels(String str) {
        char[] ch = str.toCharArray();

        int i=0 , j=ch.length-1;

        while(i<j){
            while(i<ch.length && !isVowel(ch[i])) i++;

            while(j>=0 && !isVowel(ch[j])) j--;

            if(i<j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            i++;   //ab hogya na wo i wala character swap, to aage badho..
            j--;   //wrna i aur j dono hi vowel h to dono ek doosre ko swap krte rh jaenge infinte times
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
}
