package _20_FileHandling;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File fl = new File("D:\\hello.java");
        fl.createNewFile();
    }
}
