package _01_Basics.More;
public class ContinueAndBreak  {
    public static void main(String[] args) {

        for(int i=1 ; i<=10 ; i++){
            if(i==5) continue;
            System.out.print(i);
        }

        System.out.println();

        for(char i = 'a' ; i <= 'z' ; i++){
            if(i=='m') break;
            System.out.print(i);
        }

    }
}
