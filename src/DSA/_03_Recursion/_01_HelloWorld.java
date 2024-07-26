package DSA._03_Recursion;
public class _01_HelloWorld {

    public static void printHello(int n){
        if(n==0) return;
        System.out.println("Hello World");
        printHello(n-1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}
