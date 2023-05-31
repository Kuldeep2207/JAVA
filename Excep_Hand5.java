import java.util.*;

public class Excep_Hand5{
    public static int fun1(int a, int b) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String arg[])
    {
       try{
        int c =fun1(6,0);
       System.out.println("Result -->"+c);
       }
       catch(ArithmeticException e)
       {
        System.out.println(e);
       }

    }
}