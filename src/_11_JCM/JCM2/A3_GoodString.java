package _11_JCM.JCM2;
import java.util.HashMap;
import java.util.Scanner;
public class A3_GoodString {

    public  static boolean goodString(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
            map.put(ch , map.getOrDefault(ch,0)+1);

        char[] ch = s.toCharArray();

        for(int i=0 ; i<ch.length-1 ; i++){
            if(ch[i]==ch[i+1]) continue;
            if(map.get(ch[i]) != map.get(ch[i+1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String s = sc.next();

        System.out.println("Answer:- " + goodString(s));
    }
}
