package JAVA._12_String.Questions;
public class EQ_73_Reverse {
    public static void main(String[] args) {
        String str;

        //Method-1:-

        str = "Hello";
        String rev = "";
        for (int i = str.length()-1; i>=0 ; i--)
            rev = rev + str.charAt(i);
        System.out.println(rev);

        //Method-2:-

        str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        rev = sb.reverse().toString();
        System.out.println(rev);

        //Method-3:-

        str = "Hello";
        char[] ch = str.toCharArray();
        for(int i=0 ,j=ch.length-1 ; i<j ; i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        rev = new String(ch);
        System.out.println(rev);
    }
}
