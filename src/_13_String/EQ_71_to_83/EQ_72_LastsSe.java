//72- Accept a string and print it in reverse order
package _13_String.EQ_71_to_83;
public class EQ_72_LastsSe {
    public static void main(String[] args) {
        String s = "How to Do?" ;

        for (int i=s.length()-1 ; i>=0 ; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
