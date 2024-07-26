package JAVA._18_OOPS._14_SuperKeyword_and_CC_DifferentClass._02_ConstructorCalling;

class Parent {
    Parent() {
        System.out.println("Parent Class,Default Constructor");
    }
}

public class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Class,Default Constructor");
    }

    public static void main(String[] args) {
        Child obj = new Child();  //Remember Obj bnte hi constructor call hota h
    }
}

//-- If we do not call the Parent class constructor by ourself then compiler will automatically call
//		   	   default constructor of Parent class & if we dont have such a constructor in Parent class then
//		          it will not throw any syntax error since internally it is present.
//		(It means that, in our classes when we were creating constructor , the Parent class cons(the Object
//		   class) was automatically being called by compiler)

//		    --But if the parent class constructor has a parametrized constructor and no default constructor,
//		    then it will throw an syntax error whenever you call child class constructor(i.e creates its object)
