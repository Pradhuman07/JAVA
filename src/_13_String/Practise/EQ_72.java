package _13_String.Practise;

public class EQ_72 {
    public static void main(String[] args) {
        String str = "Hello Buddy";

        for (int i=str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }

//        char ch[] = str.toCharArray();
//        for(int i=ch.length-1 ; i>=0 ; i--){
//            System.out.println(ch[i]);
//        }
    }
}
