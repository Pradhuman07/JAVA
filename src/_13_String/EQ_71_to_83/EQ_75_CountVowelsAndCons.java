package _13_String.EQ_71_to_83;
public class EQ_75_CountVowelsAndCons {
    public static void main(String[] args) {
        String s = "kyahaalchaalhbro";
        int v=0 , c=0;

        for(char ch : s.toCharArray()){
            switch(ch){
                case 'a','e','i','o','u' -> v++;
                default -> c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
    }
}

//for each loops only works on array..to pehle to hmne String ko character array mein convert kriya using s.toCharArray then
//ch naam ka ek variable bnaya (char datatype ka) uske andr s.char array ka each element patakte gye switch check krte gye
