package _09_Array.Class;

public class _02_Greatest {
    public static void main(String[] args) {
        int[] arr = {1,2,13,4,5};

        int greatest = arr[0];
        int foundAt = 0;

        for(int i=1 ; i< arr.length ; i++){
            if(arr[i]>greatest){
                greatest = arr[i];
                foundAt = i;
            }
        }
        System.out.println("Greatest ELement is:" + greatest);
        System.out.println("Found at index:" + foundAt);
    }
}
