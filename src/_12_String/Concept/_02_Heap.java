package _12_String.Concept;

import java.util.Arrays;

public class _02_Heap {
    public static void main(String[] args) {

        String s = "Hello";
//-----------------------------------------------------------------------------------------------------------------
        s.concat("buddy");         //Strings are immutable ... nayi string bni hogi
        System.out.println(s);        //Hello  //s = purani string

        System.out.println(s.concat("buddy"));    //Hellobuddy
        System.out.println(s);                       //Hello

        s = s.concat("buddy");     //purani string ko nayi value assign kri..purani string update nhi hui change hogyi..immutable
//      s = s + "buddy";               //'+' = concat
        System.out.println(s);        //Hellobuddy
//-----------------------------------------------------------------------------------------------------------------
        String s1 = "abc";                      //Created string using String literal
        String s2 = "abc";                      //String literal pool

        String s3 = "abc";   //Created string using new keyword
        String s4 = "abc";   //Heap  //new keyword mtlb heap

        System.out.println(s1 == s2);    //addreses compare honge   //true ..kyoki value same h to dono heap mein ek hi constant pool ko point out krenge to address same bn jyega
        System.out.println(s3==s4);      //inka sath aisa nhi hota

        System.out.println(s1 == s3);    //false  //can never be true
//-----------------------------------------------------------------------------
        int[] arr1 = {0, 1};
        int[] arr2 = {0, 1};
        System.out.println(arr1 == arr2);  //false  //non literals h(new keyword) alg alg address hoga

        System.out.println(Arrays.equals(arr1,arr2));
//----------------------------------------------------------------------------
    }
}
//Non primitive data ka memory allocation heap me hota h aur address stack me store hota h
//s1 aur s2 dono ek hi jgh point out krege to unka address same ho jyega
//pool me bnege wo