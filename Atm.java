import java.util.*;
public class Atm {
    public static void main(String argu[])
    {   int pin[] = { 1,2,3,4};
        int temp[]= new int[4];
        int temp2[]=new int[4];
        int count=0,count2=0,count3=0, count4=0, num;
        float balance =50000, amt;
        Scanner ob = new Scanner(System.in);
        System.out.println("Welcome to your ATM");
        System.out.println("Please enter your Pin number");
        for(int i=0;i<4;i++) 
        {
            temp[i]=ob.nextInt();
        }
        for(int i=0;i<4;i++)
        {
        if(temp[i]==pin[i])
        {
            count = count + 1;
        }}
        if(count!= 4)
        {
            System.out.println("You have entered invalid pin number");
        }
        else{
            System.out.println("You have successfully entered your pin number");
            System.out.println();
            System.out.println();
        }
        while(count == 4)
        {
           System.out.println("Welcome to your Account Dashboard");
           System.out.println();
           System.out.println();
           System.out.println("Press the option");
           System.out.println("1. Balance enquiry");
           System.out.println("2. Withdrawal");
           System.out.println("3.Exit");
          // System.out.println("4. Change Passward");
            num = ob.nextInt();
            
           switch(num){
            case 1:
            {
                System.out.println("Your balance amount is "+balance);
                System.out.println();
                break;
            }
            case 2:
            {  
                System.out.println("Enter your Pin");
                for(int i=0;i<4;i++) 
                {
                    temp[i]=ob.nextInt();}
                     
                for(int i=0;i<4;i++)
                {
                if(temp[i]==pin[i])
                {
                    count3 = count3 + 1;
                }}
                if(count3==4){
                System.out.println("Please enter the amount ");
                 amt = ob.nextFloat();
                 if(amt>balance)
                 {
                System.out.println("Insufficient amount");
                }
                else{
                    System.out.println("You have succesfully withdrawal  "+amt);
                    balance = balance - amt;
                }}
                else{
                    System.out.println("You have enter incorrect passward");
                }
                break;
            }
            case 3:
            {   
                System.out.println("Press 5 for Exit  ");
                count = ob.nextInt();
                if(count==5)
                {
                    System.out.println("*****************Thank you for using ATM*******************");
                }
                break;
            }

        }
    }
    
}}
