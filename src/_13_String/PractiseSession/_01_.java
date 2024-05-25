package _13_String.PractiseSession;
public class _01_ {

    public static void main(String[] args) {
        String s= "Hello";
        s = s.concat("hello");
        System.out.println(s);

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc";

        System.out.println(s1==s2);    //addreses compare honge
        System.out.println(s1==s3);

        int[] arr1 = {0,1};
        int[] arr2 = {0,1};

        //Non primitive data ka memory allocation heap me hota h aur address stack me store hota h
        //s1 aur s2 dono ek hi jgh point out krege aur unka address same ho jyega
        //pool
        System.out.println(arr1==arr2);  //non literals h(new keyword) alg alg address hoga
    }
}
//array me jo .lngth tha wo ek property thi
//idr wo ek funcion h