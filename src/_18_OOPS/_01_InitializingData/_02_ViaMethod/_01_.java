package _18_OOPS._01_InitializingData._02_ViaMethod;

class Teachers {

    String name;
    int age;
    int roll;

//neeche bar bar likhne se acccha ek bar method bnalo ussi hi call krte rho

    void init(String n , int a , int r){
        name = n;
        age = a;
        roll = r;

        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
    }
}

public class _01_ {
    public static void main(String[] args) {

        Teachers b1 = new Teachers();
        b1.init("Virat",25,63);

        Teachers b2 = new Teachers();
        b2.init("Rohit",155,653);

    }
}
