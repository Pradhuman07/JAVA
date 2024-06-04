package _12_String.Concept;

public class _04_NewString_Constructor_Arguments {
    public static void main(String[] args) {
        String str = "hello";

        str = Character.toUpperCase(str.charAt(0)) + str.substring(1);

        System.out.println(str);
    }
}
