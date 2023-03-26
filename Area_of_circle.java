class Area_of_circle{
    double radius = 7.2;
    double ACI;
    public static void main(String area[])
    {
      Area_of_circle obj = new Area_of_circle();
      obj.ACI = 3.14 * obj.radius * obj.radius;
      System.out.println("Area of circle = "+obj.ACI);
    }
}