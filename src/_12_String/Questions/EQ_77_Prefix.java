package _12_String.Questions;
public class EQ_77_Prefix {
    public static void main(String[] args) {
        String[] arr = {"pay","attention","practice","attend"};
        String prefix = "at";
        int count=0;


        for(int i=0 ; i< arr.length ; i++)
            if(arr[i].startsWith(prefix)) count++;

        //--------or------------------

        for(String word : arr)
            if(word.startsWith(prefix)) count++;


        System.out.println(count);
    }
}