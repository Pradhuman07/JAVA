package _12_OOPS.InitializingData;
class Teachers {
    String name;
    int age;
    int roll;
    public void init(String name , int age , int roll){
        this.name = name; //this refers to current obj; basically s1.name,s2.name ki jgh this.name
        this.age = age;
        this.roll = roll;   //ek roll global h ek local
    }
}
public class _02_ViaMethod {
    public static void main(String[] args) {
        Teachers b1 = new Teachers();
        b1.init("Virat",25,63);

        Teachers b2 = new Teachers();
        b2.init("Rohit",155,653);
    }
}
