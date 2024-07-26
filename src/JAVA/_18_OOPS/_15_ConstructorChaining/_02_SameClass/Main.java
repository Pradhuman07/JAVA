package JAVA._18_OOPS._15_ConstructorChaining._02_SameClass;
public class Main {
    int age;

    Main() {
        this(10);
        System.out.println("Default cons");
    }

    Main(int a) {
        this(50,"Ramu");
        System.out.println(a + "Para cons");
    }

    Main(int a , String name){
        System.out.println(name + a + "Para cons");
    }

    public static void main(String[] args) {
        Main obj = new Main();
    }
}