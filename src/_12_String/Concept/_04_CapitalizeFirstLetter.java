package _12_String.Concept;
public class _04_CapitalizeFirstLetter {
    public static void main(String[] args) {
        String word = "hello";

        char[] ch = word.toCharArray();  //ch={h,e,l,l,o}

        if(ch[0]>='a' && ch[0]<='z')     //Updating 0th element of ch array...rest same
            ch[0] = (char)(ch[0]-32);

        String s = new String(ch);      //What is String? It's an Array of Characters

        System.out.println(s);
    }
}
