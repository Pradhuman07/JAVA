package _18_OOPS._01_InitializingData._03_ViaConstructor;
public class Main {

    String name;
    int age;
    char gender;

    public Main(String name, int age, char gender) {     //Constructor
        this.name = name;           //this refers to the current calling object
        this.age = age;             //this = current called obj
        this.gender = gender;       //obj1.name //obj2.name ki jgh this.name

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }

    public static void main(String[] args) {
        Main2 obj1 = new Main2("Rahul" , 21 , 'M');
        Main2 obj2 = new Main2("Ritu" , 19 , 'F');
    }
}