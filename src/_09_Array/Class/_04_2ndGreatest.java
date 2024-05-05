package _09_Array.Class;
public class _04_2ndGreatest {
    public static void main(String[] args) {
        int[] arr = {10, 6, 9 , 8};

        int greatest = Math.max(arr[0], arr[1]);
        int secondGreatest = Math.min(arr[0], arr[1]);

        for (int i = 2
             ; i < arr.length; i++) {  //NOTE:- Agr initialize int i=0; se krrhe ho to you are glt
            if (arr[i] > greatest) {
                secondGreatest = greatest;
                greatest = arr[i];
            }
            else if (arr[i] > secondGreatest && arr[i]!=greatest) {
                secondGreatest = arr[i];
            }
        }

        System.out.println("The Second Greatest Element is: " + secondGreatest);

    }
}
