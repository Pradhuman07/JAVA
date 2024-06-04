package _18_OOPS._02_MethodOverloading;
public class _01_MethodOverloading {

//Three ways to Overload a Method:-
    //   i) By Changing datatype of Parameters.
    //  ii) By Changing number of Parameters.
    // iii) By Changing order of Parameters.

    public static void joy(byte x)              {}
    public static void joy(short x)             {}

    public static void joy()                    {}
    public static void joy(int x)               {}
    public static void joy(int x, int y)        {}

    public static void joy(int x ,float y)      {}
    public static void joy(float x , int y)     {}

}
