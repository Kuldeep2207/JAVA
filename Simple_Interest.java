public class Simple_Interest{
    double principle=2500.45, rate =5.6, time=2;
    double SI;
    public static void main(String aru[])
    {
        Simple_Interest obj = new Simple_Interest();
        obj.SI = (obj.principle*obj.rate*obj.time);
        System.out.println("Simple Interest using Instance Variable");
        System.out.println("Simple Interest = "+obj.SI);
    }    
}
