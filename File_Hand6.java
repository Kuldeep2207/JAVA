import java.io.*;

public class File_Hand6 {
    public static void main(String arg[])throws IOException
    {
        FileInputStream re = new FileInputStream("file.txt");
        FileOutputStream wr = new FileOutputStream("file34.txt");//file outputstream is used for create file and write in file

        int i;
        while((i=re.read())!= -1)
        {
            wr.write((char)i);
        }
        System.out.println("Data Copied Sucessfully");
        re.close();
        wr.close();
    }
    
}
