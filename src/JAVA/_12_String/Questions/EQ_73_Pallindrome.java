package JAVA._12_String.Questions;
public class EQ_73_Pallindrome {
    public static void main(String[] args) {
        String str = "madam";
        String ans = "";

        for (int i = str.length()-1; i>=0 ; i--)
            ans = ans + str.charAt(i);

        System.out.println( str.equals(ans) ? "Palin" : "Not Palin" );
    }
}
//Note:-Since strings are immutable in nature so line no. 8 ki wjh se hr bar ek nayi string bnegi(string update nhi hoti)
//Which means Space Complexity high
//and that is why we Use String builder

//Never write str==ans? .. it's not for strings ... basically it will just check addresses of the strings and not the value
//str.compareto(ans) will give -ve,0,+ve ..checks ascii values lexicographically one by one each word from starting to end.. RT = int
//str.equals(ans) will give you boolean result.