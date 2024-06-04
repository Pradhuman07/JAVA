package _12_String.Concept;
public class _00_Methods {
    public static void main(String[] args) {

        String str = "Hello Buddy ";
//---------------------------------------------------------------------------
        System.out.println(str.length());    //12
        System.out.println(str.charAt(0));   //H
        System.out.println(str.charAt(str.length()-1));    //" "
//---------------------------------------------------------------------------
        System.out.println(str.trim());    //"Hello Buddy"
//---------------------------------------------------------------------------
        System.out.println((int)'H');       //72
        System.out.println((int)'h');       //104
//---------------------------------------------------------------------------
        System.out.println(str.compareTo("Hello Buddy "));   //0
        System.out.println(str.compareTo("hello Auddy "));   //-32 (H-h=-32)  (H=65+7=72 , h=97+7=104)
        System.out.println(str.compareTo("Hello Auddy "));   //1  (B-A = 66-65=1)
//---------------------------------------------------------------------------
        System.out.println(str.equals("Hello Buddy ")); //true    //str.compareto("xyz") returns integer value..basically compares ASCII values for each character
        System.out.println(str.equals("Hello noddy"));  //false   //str.equals("xyz") returns boolean value
//---------------------------------------------------------------------------
        System.out.println(str.toUpperCase());   //"HELLO BUDDY "
        System.out.println(str.toLowerCase());   //"hello buddy "
//---------------------------------------------------------------------------

        System.out.println(" ".isBlank());    //true
        System.out.println(" ".isEmpty());    //false

        System.out.println("Hello".startsWith("H"));      //true
        System.out.println("Hello".startsWith("Hello"));  //true
        System.out.println("Hello".endsWith("llo"));      //true
        System.out.println("Hello".endsWith("Hello"));    //true

        System.out.println("hello".equals("Hello"));                           //false
        System.out.println("hello".equalsIgnoreCase("Hello"));     //true
        System.out.println("hello".compareTo("Hello"));                       //32

        System.out.println("Hello".substring(2)); //llo   //2 se shuru hoga ant tk jyega (includes 2)
        System.out.println("Hello".substring(2,4));        //ll    //2 se shuru hoga 4 tk jyega (includes 2 but not 4)
    }
}

//array me jo .lngth tha wo ek property thi
//idr wo ek funcion h
