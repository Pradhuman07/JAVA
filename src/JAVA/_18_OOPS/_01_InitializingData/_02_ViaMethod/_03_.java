package JAVA._18_OOPS._01_InitializingData._02_ViaMethod;

class Teache {

    String name;
    int age;
    int roll;

    public void init(String name , int age , int roll){
        this.name = name;   //this refers to current calling object;
        this.age = age;     //basically s1.name,s2.name ki jgh this.name  (this = current called object)
        this.roll = roll;   //ek roll global h (Teache class ka) ek local h (inti method ka)

        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
    }

}
public class _03_ {
    public static void main(String[] args) {

        Teache b1 = new Teache();
        b1.init("Virat",25,63);

        Teache b2 = new Teache();
        b2.init("Rohit",155,653);

    }
}
