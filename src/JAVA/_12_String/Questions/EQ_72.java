package JAVA._12_String.Questions;
public class EQ_72 {
    public static void main(String[] args) {
        String str = "Hello Buddy";
//----------------------------------------------------Using charAt and for
        for (int i=str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }
//-----------------------------------------------------
        char[] ch = str.toCharArray();

//Using For Each
        int i=str.length()-1;
        for(char c : ch)
            System.out.println(ch[i--]);
//Using For
        for(int j=str.length()-1 ; j>=0 ; j--)
            System.out.println(ch[j]);
    }
}
