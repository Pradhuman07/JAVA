package JAVA._18_OOPS._01_InitializingData._02_ViaMethod;

class Teacher {

    String name;
    int age;
    int roll;

    public void init(String name , int age , int roll){

        name = name;        //Yha pr dost ambiguity hojyegi kisme kisko daalna h
        age = age;          //and that is why we use this pointer
        roll = roll;

        System.out.println(name);    //Hn print ho rha hoga but
        System.out.println(age);     //see line 5,6,7...field 'name','age','roll' of class Teacher is never used
        System.out.println(roll);    //iska mtlb wo use hi nhi ho rhe bss method call horha aur oot patang hrkt ho rhi
    }

}
public class _02_ {
    public static void main(String[] args) {

        Teacher b1 = new Teacher();
        b1.init("Virat",25,63);

        Teacher b2 = new Teacher();
        b2.init("Rohit",155,653);

    }
}
