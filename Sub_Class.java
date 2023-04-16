import java.util.*;
 class Base{
    double principle;
    double rate;
    double time;
}
 class Child extends Base
{   double Simple_Interest;
    void method(){
    Child obj = new Child();
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the details");
    obj.principle = ob.nextDouble();
    obj.rate = ob.nextDouble();
    obj.time = ob.nextDouble();
    Simple_Interest = (obj.principle*obj.rate*obj.time)/100;
    }   
}
public class Sub_Class extends Child
{
    public static void main(String arg[])
    {
    Sub_Class ob1 = new Sub_Class();
    ob1.method();
    System.out.println(" Simple Interest = "+ob1.Simple_Interest);
    }
}