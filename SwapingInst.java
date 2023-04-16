import java.util.*;
public class SwapingInst {
    double x ,y;
    public static void main(String arg[])
    {
        SwapingInst obj = new SwapingInst();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the First number");
        obj.x = ob.nextDouble();
        System.out.println("Enter the Seconds number");
        obj.y = ob.nextDouble();
        obj.x = obj.x + obj.y;
        obj.y = obj.x - obj.y;
        obj.x = obj.x - obj.y;
        System.out.println(obj.x+"and"+obj.y);
    }
    
}
