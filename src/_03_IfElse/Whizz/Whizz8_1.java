package _03_IfElse.Whizz;

public class Whizz8_1 {
//    What is the output of the Java code?
    public static void main(String[] args) {

        int x=11, y=22;

        if(++x == 11 && ++y == 23){
        System.out.println(x + " " + y);}

        else if(x++ == 12 && y-- == 23){
            System.out.println(x + " " + y);
        }

        else{
            System.out.println(x + " " + y);
        }

//        12 23
//        13 22
//        13 21
//        11 22  selected by you
    }

}
