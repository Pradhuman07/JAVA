package _12_String.Concept;
public class _03_NewStringConstructorArgument {
    public static void main(String[] args) {
        String Str = "hello";
        System.out.println(Str);

        char[] ch = {'h','e','l','l','o'};
        String str = new String(ch);        //What is String? It's an Array of Characters

        System.out.println(str);
    }
}
//new String ke constructor mein as a Argument hm String bhi de skte h aur Character array bhi pass kr skte h
