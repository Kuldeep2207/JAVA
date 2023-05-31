import java.io.File;
import java.io.IOException;


public class File_Han2 {
    public static void main(String arg[])throws IOException
    {
        File f1 = new File("file.txt");
        boolean value = f1.exists();
        if(value)
        {
            System.out.println("FILE NAME --> "+f1.getName());
            System.out.println("FILE LOACTION --> "+f1.getAbsolutePath());
            System.out.println("FILE WRITEABLE -->"+f1.canWrite());
            System.out.println("FILE READABLE --> "+f1.canRead());
            System.out.println("FILE LENGTH --> "+f1.length());
            System.out.println("FILE DELETE --> "+f1.delete());
        }
        else{
            System.out.println("FILE NOT FOUND");
        }
    }
    
}
