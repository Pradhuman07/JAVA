//74- Pallindromic String using method and Two pointer algorithm
package _13_String.EQ_71_to_83;
public class EQ_74_UsingMethod {

    public static boolean checkPalin(String s) {
        int i=0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(checkPalin(s));
    }
}
//Solved without using Another String so less Space Complexity