package JAVA._09_Array.EQ;
public class _06_ThirdMax {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        long max = Long.MIN_VALUE;
        long Smax = Long.MIN_VALUE;
        long Tmax = Long.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > max){
                Tmax = Smax;
                Smax = max;
                max = nums[i];
            }
            else if(nums[i]>Smax && nums[i]<max){
                Tmax = Smax;
                Smax = nums[i];
            }
            else if(nums[i]>Tmax && nums[i]<Smax){
                Tmax = nums[i];
            }
        }
        System.out.println(Tmax==Long.MIN_VALUE ? (int)max : (int)Tmax );
    }
}
