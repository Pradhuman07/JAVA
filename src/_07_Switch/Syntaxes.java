package _07_Switch;
import java.util.Scanner;
public class Syntaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number: ");
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("Mon");
            case 6 -> System.out.println("Sat");
            case 3 -> System.out.println("Wed");
            default -> System.out.println("Galat h");
            case 4 -> System.out.println("Thurs");
            case 5 -> System.out.println("Fri");
            case 7 -> System.out.println("Sun");
            case 2 -> System.out.println("Tue");
        }

            String res=switch(day){
            case 6 -> "Sat";
            case 3 -> "Wed";
            default -> "Galat h";
            case 4 -> "Thurs";
        };                                //semicolon since expression
        System.out.println(res);


        System.out.println(switch(day){
            case 1 -> {
                yield "Mon";  //for only one exp yield not necessary
            }
            case 2 -> {
                int a = 5;
                yield "Mon";
            }
            case 6 -> "Sat";
            case 3 -> "Wed";
            default -> "Galat h";
            case 4 -> "Thurs";
        });

        }
    }

//H,w Calculator 1 for add 2 for
//Q43 22 also hw