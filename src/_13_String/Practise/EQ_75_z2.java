package _13_String.Practise;

public class EQ_75_z2 {
    public static void main(String[] args) {
        String str = "HelloBuddy";
        int vc=0 , cc=0;

        char[] ch = str.toCharArray();

        for(char c : ch){
            switch (c){
                case 'a','e','i','o','u' -> vc++;
                default -> cc++;
            }
        }

        System.out.println(vc);
        System.out.println(cc);
    }
}
