package _13_String.EQ_71_to_83;

import java.util.Arrays;

public class EQ_75_0_ForEachNote {
    public static void main(String[] args) {
        String s = "Extraordinary";

        for(char ch : s.toCharArray()){
            System.out.print(ch + ",");
        }

        System.out.println();

        System.out.println(Arrays.toString(s.toCharArray()));    //same thing
    }
}

//for each loops only works on array..to pehle to hmne String ko character array mein convert kriya using s.toCharArray then
//ch naam ka ek variable bnaya (char datatype ka) uske andr s.char array ka each element patakte gye print krate gye

//At the same time we can also do this thing using Line no. 15

