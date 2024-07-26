package JAVA._01_Basics.More;
public class Exor_NonRepeatingElement {
    public static void main(String[] args) {
//Note:- All element twice only , not thrice...since x^x^x=x and not 0 but x is not unique

        int[] nums = {1,2,1,2,3,4,3};

        int ans = 0;

        for(int a : nums)
            ans = ans^a;

        System.out.println(ans);   //4
    }
}
// 0^x=x //x^x=0 //So Finally; ans = 0^x^x^y^y^z = x^x^y^y^z = 0^0^z = z

//Note:- x^x^x = x and not 0.