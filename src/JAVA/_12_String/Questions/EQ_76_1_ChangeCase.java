package JAVA._12_String.Questions;
public class EQ_76_1_ChangeCase {
    public static void main(String[] args) {
        String str = "DcgMPup";
        String ans = "";

        for(char c : str.toCharArray()){
            if(c>='A' && c<='Z') ans = ans + (char)(c+32);
            else ans = ans + (char)(c-32);
        }

        System.out.println(ans);
    }
}

//NOTE:-
        //'a' + 'b' = 195
        //but "" + 'a' + 'b' = ab


    //System.out.println('a'+'b');        //195  //Arithmetic Operations b/w characters convert them into ascii values
    //System.out.println("" + 'a'+'b');   //ab