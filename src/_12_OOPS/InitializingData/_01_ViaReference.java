package _12_OOPS.InitializingData;
class Student{
    String name;
    int age;
    int roll;
}
public class _01_ViaReference {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Virat";
        s1.age = 18;
        s1.roll = 21;

        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = 45;
        s2.roll = 2;
    }
}
