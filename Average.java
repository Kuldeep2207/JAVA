 class Average {
    int num1 = 97, num2 =95 ,num3 =96;
    double avg, sum=0;
    public static void main(String arg[])
    {
        Average obj = new Average();
        obj.sum = obj.num1 + obj.num2 + obj.num3;
        obj.avg = obj.sum/3;
        System.out.println("Sum of numbers ="+obj.sum);
        System.out.println("Average ="+obj.avg);
    }
    
}
