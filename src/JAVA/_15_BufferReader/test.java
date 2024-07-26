package JAVA._15_BufferReader;

public class test {
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
    public static void main(String[] args) {
        String str = "leetcode";
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
            i++;
            j--;
        }

        System.out.println(new String(ch));
    }
}
