package _18_OOPS._08_Inheritance._05_Interface;

class Parent{
    Parent(){
        System.out.println("Parent,Default Cons");
    }
}
public class Child extends Parent{
    Child(){
        System.out.println("Child,Default cons");
    }
    public static void main(String[] args) {
//        Child obj = new Child();
//        Set<Integer> obj = new HashSet<>();
          Parent obj = new Child();    //Parent ka reference leke Child ka object bna skte h koi dikkt wli baat nhi
          //but calling child ka cons..however child ka cons will first call parent ka cons
    }
}