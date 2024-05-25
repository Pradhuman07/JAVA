package _13_String.Practise;
public class EQ_76_z2 {
    public static void main(String[] args) {
        String str = "AcgFDu";
        String ans = "";

        for(char ch : str.toCharArray()){
            if(ch>='A' && ch<='Z') ans = ans + (char)(ch+32);
            else ans = ans + (char)(ch-32);
        }

        System.out.println(ans);
    }
}
//NOTE:-

        //'a' + 'b' = 195
        //but "" + 'a' + 'b' = ab

    //System.out.println('a'+'b');        //195
    //System.out.println("" + 'a'+'b');   //ab
