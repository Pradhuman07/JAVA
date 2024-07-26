package JAVA._11_JCM.JCM1;
import java.util.Arrays;
public class B1_RunningSum_On {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};   //O/P = 1,3,6,10

        int sum=0;

        for(int i=0;i< nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }

        System.out.println(Arrays.toString(nums));
    }
}