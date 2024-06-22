package _11_JCM;
import java.util.Arrays;
public class B1_On2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};            //O/P - nums = [1,3,6,10]

        for(int i=nums.length-1 ; i>=0 ; i--){
            int sum=0;

            for(int j=0; j<=i ; j++)
                sum+=nums[j];

            nums[i] = sum;
        }

        System.out.println(Arrays.toString(nums));
    }
}
