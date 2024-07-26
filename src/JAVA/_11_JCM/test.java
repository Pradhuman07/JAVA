package JAVA._11_JCM;

public class test {
    public static void main(String... args) {   //varags
        StringBuilder sb = new StringBuilder("fedcba");
        sb.insert(3,"---");
        System.out.println(sb);
    }
}
