package JAVA._18_OOPS._08_Inheritance._03_Hierarchical;

class Animal{
    void speaks(){
        System.out.println("Yes Speaks");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Barking");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("Roaring");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.barks();
        obj.speaks();

        Lion obk = new Lion();
        obk.roar();
        obk.speaks();
    }
}
