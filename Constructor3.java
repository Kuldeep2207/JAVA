//Use of this() method
class A{                                 // Super class
    public A()                          // default constructor of claas A
    {
        super();
        System.out.println("in A");
    }
    public A(int n)                     // parameterzied constructor of class A
    {
        super();
        System.out.println("in A Int");
    }
}
class B extends A{                       // Sub class
    public B()                           // default constructor of class B
    {
        super();
        System.out.println("in B");
    }
    public B(int n){  
                                             // parameterzied constructor of class B
        this();                              // its will invoke default constructor of same class because parameter is not pass when we pass paramter in this() then parameterzied constuctor of same class invoke                                     
        System.out.println("in B Int");
    }
}
public class Constructor3{
    public static void main(String arg[]){
    // B obj =new B();                     // when we create a object of class B then automatically invoke the default contructor of both Super class and Sub class 
    //what if 
    //B obj =new B(23);                   // here when we pass a paremeter then object invoke parametezied constructor of class B with default constructor of class A,this happen because of inbuilt super();,it genernally invoke default constructor
                                          //of that class because every constructor first line super() weather we write in class or not ,calling by parameterzied constructor super()which is written in it
     B obj =new B(23);                  // here parameterzied constructor of class A because we pass a parameter in super(n) then automatically invoke parameterzied constructor of class A
     // when we want to call both the constructor of same class invoking only one class also super class constructor invoke use this()
}
    

    
}
