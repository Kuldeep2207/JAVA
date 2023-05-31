import java.util.*;
public class Excep_Hand2 {
    public static void main(String arg[])
    {
        int amount , withdrwal_amt ;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        withdrwal_amt = sc.nextInt();
        sc.close();
        try{
        if(amount<withdrwal_amt)
        {
            throw new ArithmeticException();
           // System.out.println("Insufficient Balance");
        }
        else{
            amount = amount - withdrwal_amt;
            System.out.println("Transaction is successfully");
            System.out.println("Your Amount is -->"+amount);
        }
    }catch(ArithmeticException e )
    {
        System.out.println(e.getMessage());
    }
    }
    
}
