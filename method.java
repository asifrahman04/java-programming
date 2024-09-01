public class method {
    public static int sum(int a,int b)
    {
        int sum;
        
        
        sum=a+b;
        return sum;
        
    }
    public static int fac(int num)
    {
        int fac=1,i;
        for(i=1;i<num;i++){
            fac=i*num;
           
        }
                
        return fac;

    }
    public static void main(String args[])
    {
        int a,b;
        a=10;
        b=9;
       int sum =sum(a,b);
        System.out.println("the sum is:"+sum);
        int num=4;
      int fac=  fac(num);
        
        System.out.println("the factorial is"+fac);
        
    }
    
}
