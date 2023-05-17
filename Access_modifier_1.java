import java.util.*;
class MyEmployee{
    private int id;             //private data member declear
    private String name;        //private data member declear

    //for accessing private member we use some access method which we called as gettter and setter

    public int getid()
    {
        return id;
    }
    public void setid(int x){
        id =x;
    }
   String getname(){
        return name;
    }
   void setname(String x)
    {
        name =x;
    }
}
public class Access_modifier_1 {
    public static void main(String agr[]){
        MyEmployee Harry = new MyEmployee();
        //Harry.id = 45;
        //Harry.name = "CodewitheHarry";
        Harry.setid(45);
        System.out.println("Id of Harry -->"+Harry.getid()); 
        Harry.setname("CodeWithHarry");
        System.out.println("Name -->"+Harry.getname());
    }
}
