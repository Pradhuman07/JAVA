package _18_OOPS._06_EqualityOfObject;
import java.util.Objects;
public class Main {

    String name;
    int age;

    Main(String name , int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Main o) {       //o = obj2
        if (this == o) return true;      //obj1 == obj2         //always false since address compare horhe
        if (!(o instanceof Main)) return false;            //object2 is a object of class Main
        return this.age == o.age && this.name.equals(o.name);   //true
    }

    public int hashCode() {                 //it is a method which generates a random number according to argument
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Main obj1 = new Main("Ram" , 18);
        Main obj2 = new Main("Ram" , 18);

        System.out.println(obj1==obj2); //always false...compares address

        System.out.println(obj1.hashCode());    //generates a random number
        System.out.println(obj2.hashCode());    //equals if equal arguments

        System.out.println(obj1.equals(obj2));
    }
}
