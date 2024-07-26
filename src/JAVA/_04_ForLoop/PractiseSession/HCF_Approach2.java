package JAVA._04_ForLoop.PractiseSession;
import java.util.Scanner;
public class HCF_Approach2 {
    public static void main(String[] args) {
        System.out.println("Enter 2 no.s: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //12
        int b = sc.nextInt();  //6

        while(a!=b){
            if(a>b) a=a-b;     //dry run line 11 and 12
            else b=b-a;
        }
        System.out.println("HCF is: " + a);
    }
}
//Idr time complexity is O(jo bada no. h)   [0=Worst Case]
//Bada no. bcoz suppose a=1000,b=1 ...a>b,therfore a=a-b=999,again a>b ,a=a-b=998, then 997 ,996,..0
//So Approach one is best