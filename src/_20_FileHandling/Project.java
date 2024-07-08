package _20_FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Project {
    public static void main(String[] args) throws Exception{
        String path = "C://Users//yashc//OneDrive//Desktop//FileHandling//";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folder/project name");
        String project_name = sc.nextLine();

        File folder = new File(path+project_name);
        folder.mkdir();

        //stuff for HTML
        File flHTML = new File(path+project_name+"//index.html");
        flHTML.createNewFile();

        FileWriter fwHTML = new FileWriter(flHTML);
        fwHTML.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>hey people how are you</h1>\n" +
                "\n" +
                "\n" +
                "    <script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "</html>");
        fwHTML.close();

        //stuff for CSS
        File flCSS = new File(path+project_name+"//style.css");
        flCSS.createNewFile();

        FileWriter fwCss = new FileWriter(flCSS);
        fwCss.write("*{\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "    box-sizing: border-box;\n" +
                "}\n" +
                "html,body{\n" +
                "    height: 100%;\n" +
                "    width: 100%;\n" +
                "}\n" +
                "h1{\n" +
                "    color: red;\n" +
                "}");
        fwCss.close();

        //stuff for JS
        File flJS = new File(path+project_name+"//script.js");
        flJS.createNewFile();

    }
}

