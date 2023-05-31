import java.util.*;
public class Excep_Hand6 {
    public static int divide(int a, int b)throws ArithmeticException{
        int Result = a/b;
        return Result;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
          int c = divide(a , b);
        System.out.println("Result-->"+c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }

    }
}
