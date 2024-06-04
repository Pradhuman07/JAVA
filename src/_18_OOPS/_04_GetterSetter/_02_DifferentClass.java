package _18_OOPS._04_GetterSetter;
class A{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class _02_DifferentClass {
    public static void main(String[] args) {
        A obj = new A();

   //   obj.age = 15;  //(Error) not possible now bcoz age is private property of class A

        obj.setAge(18);
        System.out.println(obj.getAge());
    }
}