package _12_String.Questions;
public class EQ_74_Optimized_UsingMethod {

    public static boolean checkPalin(String str) {
        int i=0 , j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalin(str));
    }

}