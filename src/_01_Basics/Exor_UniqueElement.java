package _01_Basics;

public class Exor_UniqueElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3,4,3};

        int ans = 0;        // not nums[0] glt hojyega poora

        for(int a : nums)
            ans = ans^a;

        System.out.println(ans);
    }
}
// 0^x=x //x^x=0 //So Finally; ans = 0^x^x^y^y^z = x^x^y^y^z = 0^0^z = z