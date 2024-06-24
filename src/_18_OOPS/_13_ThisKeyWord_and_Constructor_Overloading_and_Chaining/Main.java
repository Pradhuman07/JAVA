package _18_OOPS._13_ThisKeyWord_and_Constructor_Overloading_and_Chaining;
public class Main {

    int age=5;

    void fun(){
        System.out.println("funning");
    }

    Main() {
        this(10);
        System.out.println("Default cons");
        this.fun();
        this.age = 10;
    }

    Main(int a) {
        this("Ram");
        System.out.println(a);
    }

    Main(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.age);
    }
}

//this keyword is used for Constructor chaining