package JAVA._18_OOPS._04_GetterSetter;
public class _01_SameClass {
    private int age;   //private instance variable

    public static void main(String[] args) {
        _01_SameClass obj = new _01_SameClass();
        obj.age = 45;                 //possible bcoz bhale hi age private h pr h to class ke andr hi na...isi class me access kr pa rhe h doosri mein nhi kr paate
        System.out.println(obj.age);
    }
}
