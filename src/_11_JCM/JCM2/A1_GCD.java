package _11_JCM.JCM2;
import java.util.Scanner;
public class A1_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers:- ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int dup = x;

        //15,20,100 = 60
        //30,40,400 = 120

        int lcm1=1;
        int lcm2=1;

        for(int i=1 ; x!=1 && y!=1; i++){
            if(x%i==0 && y%i==0){
                lcm1*=i;
                x/=i;
                y/=i;
                i=1;
            }
            else if(x%i==0){
                lcm1*=i;
                x/=i;
                i=1;
            }else if(y%i==0){
                lcm1*=i;
                y/=i;
                i=1;
            }
        }

        x=dup;

//        System.out.println(lcm1);

        for(int i=1 ; i<Math.max(x,z) ; i++){
            if(x%i==0 && z%i==0){
                lcm2*=i;
                x/=i;
                z/=i;
                i=1;
            }
            else if(x%i==0){
                lcm2*=i;
                x/=i;
                i=1;
            }else if(z%i==0){
                lcm2*=i;
                z/=i;
                i=1;
            }
        }

//        System.out.println(lcm2);

        int gcd=1;

        for(int i=Math.min(lcm1,lcm2) ; i>=1 ; i--){
            if(lcm1%i==0 && lcm2%i==0){
                gcd = i;
                break;
            }
        }

        System.out.println("Answer:- " + gcd);
    }
}
