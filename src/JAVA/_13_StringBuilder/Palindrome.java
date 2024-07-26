package JAVA._13_StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString().equals(str));
    }
}
