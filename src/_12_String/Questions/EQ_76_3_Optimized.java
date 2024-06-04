package _12_String.Questions;
public class EQ_76_3_Optimized {
    public static void main(String[] args) {
        String str = "DcgMPup";

        char[] ch = str.toCharArray();

        for(int i=0 ; i<ch.length ; i++) {
            if (Character.isLowerCase(ch[i])) ch[i] = Character.toUpperCase(ch[i]);
            else ch[i] = Character.toLowerCase(ch[i]);
        }

        System.out.println(new String(ch));
    }
}

//ans = ans + ...   Since Strings are immutable to aise me
// hr bar ek nayi string bnegi to SC very high

//But idr bss Array mein manipulations kr rhe h jo ki na to space khaate h aur bhot
//fast bhi hote h
//Ant mein bss ek bar unko String mein convert kr rhe using new String