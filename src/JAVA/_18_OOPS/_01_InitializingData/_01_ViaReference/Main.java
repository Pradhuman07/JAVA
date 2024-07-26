package JAVA._18_OOPS._01_InitializingData._01_ViaReference;

class Student{

    String name;       //Instance variable (Object ki property)
    int age;
    int roll;          //Non-static

}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Virat";     //Static variables ko class ke naam se access krte h
        s1.age = 18;           //Non-static ko object ki help se
        s1.roll = 21;

        Student s2 = new Student();

        s2.name = "Rohit";
        s2.age = 45;
        s2.roll = 2;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.roll);
    }
}
