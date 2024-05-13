package _12_OOPS.InitializingData;

public class _03_ViaConstructor{
    String name;
    int age;
    char gender;

    public _03_ViaConstructor(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name=" + name + ",age=" + age + ",gender=" + gender;
    }

    public static void main(String[] args) {

        _03_ViaConstructor p1 = new _03_ViaConstructor("Rahul" , 21 , 'M');
        _03_ViaConstructor p2 = new _03_ViaConstructor("Ritu" , 19 , 'F');

        System.out.println(p1);
        System.out.println(p2);      //(p2.toString) not necessary
    }
}