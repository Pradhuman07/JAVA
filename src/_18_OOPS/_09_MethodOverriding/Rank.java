package _18_OOPS._09_MethodOverriding;

class A{
     void greet(){
        System.out.println("Hello A");
    }
}

//"If you are overriding a method , the overriden method can not be more restrictive."
public class Rank extends A {
    protected void greet(){            //private likhte to error aati
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

