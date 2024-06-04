package _01_Basics;

public class ContinueAndBreak  {
    public static void main(String[] args) {

        for(int i=1 ; i<=10 ; i++){
            if(i==5) continue;
            System.out.println(i);
        }

        for(char i = 'a' ; i < 'j' ; i++){
            if(i=='f') break;
            System.out.println(i);
        }

    }
}
