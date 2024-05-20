package _09_Array.EQ;

public class _21_Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 2, 2, 6};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 1;
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (temp == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println(temp + "->" + count); //if ke andr hi rkhna isko
            }
        }
    }
}