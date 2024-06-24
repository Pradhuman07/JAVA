package _18_OOPS._01_InitializingData._03_ViaConstructor;
public class Main2 {

    String name;    //instance variable...mtlb object ke variable
    int age;
    char gender;

    Main2(String name, int age, char gender) {
        this.name = name;      //this. mtlb current calling object...mtlb this.name=instance variable
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return  "name = " + name   +   "\nage = " + age   +   "\ngender = " + gender;
    }

    public static void main(String[] args) {
        Main2 obj1 = new Main2("Rahul" , 21 , 'M');
        Main2 obj2 = new Main2("Ritu"  , 19 , 'F');

        System.out.println(obj1);             //calling to String
        System.out.println(obj2);
    }
}