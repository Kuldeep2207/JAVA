import java.io.File;
import java.io.IOException;
public class File_Han1 {
    public static void main(String arg[])throws IOException
    {
        // Creating new file 
        File f1 = new File("file.txt");
        boolean value = f1.createNewFile();
        if(value)
        {
            System.out.println("FILE CREATED SUCCESSFULLY....");
        }
        else{
            System.out.println("FILE ALREADY EXIST");
        }
    }
    
}
