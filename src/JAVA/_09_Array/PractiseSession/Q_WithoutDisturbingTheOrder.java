package JAVA._09_Array.PractiseSession;
import java.util.Arrays;
public class Q_WithoutDisturbingTheOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,0,-3,12};

        int index = -1;                                // index <--> indexForNonZeroELement

        for (int i=0; i<nums.length; i++)
            if (nums[i]!=0){                            //non zero
                index++;
                nums[index] = nums[i];
            }                                           //[1,3,12,_,_]


        for (int i = index+1; i<nums.length; i++)
            nums[i] = 0;                                //[_,_,_,0,0]

        System.out.println(Arrays.toString(nums));
    }
}
