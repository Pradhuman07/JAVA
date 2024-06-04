package _12_String.Questions;
public class EQ_75_VowelsAndCons {
    public static void main(String[] args) {
        String str = "HelloBuddy";
        int vc=0 , cc=0;

        for (char c : str.toCharArray()) {
            switch (c){                     //character pass kr rhe
                case 'a','e','i','o','u' -> vc++;
                default -> cc++;
            }
        }

        System.out.println(vc);
        System.out.println(cc);
    }
}
