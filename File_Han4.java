// Read from file

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class File_Han4 {
    public static void main(String arg[])throws IOException
    {
       File myfile = new File("file.txt");
       String Line="";
       Scanner sc = new Scanner(myfile);
       while(sc.hasNextLine()){
            Line += sc.nextLine();
            Line +="\n"; 
       }
       System.out.println(Line);
       sc.close();

    }
    
    
}
