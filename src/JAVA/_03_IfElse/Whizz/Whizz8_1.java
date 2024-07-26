package JAVA._03_IfElse.Whizz;
public class Whizz8_1 {
    public static void main(String[] args) {
//    What is the output of the Java code?

        int x=11, y=22;

        if(++x == 11 && ++y == 23){         //12==11 false ..aage compiler nhi jayega kyoki && laga h and false && x = false so no matter
        System.out.println(x + " " + y);
        }                                    //x=12 , y=same=22

        else if(x++ == 12 && y-- == 23){         //12==12 true , 22==23 false
            System.out.println(x + " " + y);
        }                                       //x=13  , y = 21

        else{
            System.out.println(x + " " + y);     //13 , 21
        }

//        12 23
//        13 22
//        13 21
//        11 22  selected by you
    }

}
