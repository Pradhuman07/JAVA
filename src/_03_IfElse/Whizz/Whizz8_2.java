package _03_IfElse.Whizz;
public class Whizz8_2 {
    public static void main(String[] args) {
    //What is the output of the Java code ?
        int x = 11, y = 22;

        if (x++ == 11 || ++y == 23) {             //11==11 true ...aage nhi dekhege kyoki || lga h and true || x = true
            System.out.println(x + " " + y);     //12,22
        }
        else {
            System.out.println(x + " " + y);
        }
    }
}
// 11 23
// 11 22
// 12 22
// 12 23  selected by you