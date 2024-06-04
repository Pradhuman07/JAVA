package _18_OOPS._03_ArrayOfObjects;

public class Revise {
    String name;
    int age;
    String branch;

    Revise(String name , int age , String branch){
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public String toString(){
        return "name = " + name + ", age = " + age + ", branch = " + branch;
    }

    public static void main(String[] args) {
        Revise obj1 = new Revise("Ram" , 13 , "CS");
        Revise obj2 = new Revise("Shyam" , 15 , "AI");

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
