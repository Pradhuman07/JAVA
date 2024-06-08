package _18_OOPS._09_MethodOverriding;

class A{
    private void greet(){
        System.out.println("Hello A");
    }
}
public class Rank extends A {
    protected void greet(){
        System.out.println("Hello A");
    }

    public static void main(String[] args) {
        Rank obj = new Rank();
        obj.greet();
    }
}

//Child ke pass over ride method ki upper rank honi chahiye ya fir barabar honi chahiye

//Rank --> [ private < default < protected < public ]

//Parent - private     ,    child - private/default/protected/public
//Parent - default     ,    child - default/protected/public
//Parent - protected   ,    child - protected/public
//Parent - public      ,    child - public