package JAVA._20_FileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _01_textFile {
    public static void main(String[] args) throws IOException {
        File fl = new File("C://Users//yashc//OneDrive//Desktop//FileHandling//temp");
        fl.createNewFile();

        FileWriter fw = new FileWriter(fl);
        fw.write("Hello Buddy");
        fw.close();

//        Scanner sc = new Scanner(fl);
//        while(sc.hasNext()){
//            String data = sc.next();
//            System.out.print(data + " ");
//        }

        FileReader fr = new FileReader(fl);
        int i;
        while((i=fr.read())!=-1){        //fr.read i characters ki ascii value ko read krta h..kisi bhi vharacter ki ascii value -1 nhi hoti...-1 is the ascii value for jb kuch nhi bacha
            System.out.print((char)i);
        }
    }
}
