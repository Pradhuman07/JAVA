package JAVA._18_OOPS.Whizz.Inheritance._01_;

class A {
    int i;
    int j;
    A() {
        i = 1;    //this lgane ki zrurt nhi pdi? gadhe this ka use hm ambiguity hatane krte th..this.name = name; bina this ke bhi to name = n ; likhskte th na
        j = 2;
    }
}

class B extends A {
    int a;
    B() {
       // super();   //keyword that calls parent ka constructor...Note:- na bhi likhte to bhi parent ka cons automatically call hota h dhyan rkhna hmesha
       // super.A(); //wrong..cons ko aise call nhi krte kbhi bhi
    }
}

class super_use {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.i + " " + obj.j);
    }
}

//No public class!?