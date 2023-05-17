class Human{
    private int age;
    private String name;
    // you can also use this in place of This keyword
    // public void setage(int age,Human obj)
    // {
    //    Human obj1 =obj;
    //    obj1.age =age;
    // }
     public void setage(int age)
    {
       this.age =age;
    }
    public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
}
public class This1 {
    public static void main(String arg[])
    {
        Human obj = new Human();
        obj.setage(23);
       System.out.println(obj.getage());
       obj.setname("CodeWithHarry");
       System.out.println(obj.getname());
    }

    
}
