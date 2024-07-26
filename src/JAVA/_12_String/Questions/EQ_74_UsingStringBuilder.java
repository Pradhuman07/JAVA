package JAVA._12_String.Questions;

public class EQ_74_UsingStringBuilder {
    public static void main(String[] args) {
        String str = "madam";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString().equals(str));
    }
}
