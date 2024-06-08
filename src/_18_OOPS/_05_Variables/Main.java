package _18_OOPS._05_Variables;

public class Main {
    static int age;     //age = static variable ... class ki property
    int roll;           //roll = instance variable..object ki property

    public static void main(String[] args) {
        Main obj = new Main();

        age = 21;
        Main.age = 31;
        age = 41;      //run time pr Main.age me convert hojyega
        obj.roll = 148;
    }
}
