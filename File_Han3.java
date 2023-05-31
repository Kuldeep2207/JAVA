//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Writing in the file
public class File_Han3 {
    public static void main(String arg[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = sc.nextLine();
        sc.close();
        //Writing the file into file
        FileWriter f2 = new FileWriter("file.txt");
        f2.write(str);

        //close Stream
        f2.close();
        System.out.println("FILE SUCCESSFULLY WRITING");
    }
    
}
