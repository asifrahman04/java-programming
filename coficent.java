public class coficent {
    public static int fac(int num)
    {
        int fac=1,i;
        for(i=1;i<num;i++){
        fac=num*i;
        }
         return fac;
    }
    public static int coficint(int r,int n)
    {
        int fact_n=fac(n);
        int fact_r=fac(r);
        int fact_nmr=fac(n-r);
        int coficint=fact_n /fact_r*fact_nmr;
        return coficint;

        
    
    }
    public static void main(String args[])
    {
    
     int r=5,n=8;
     int coeficint=coficint(r,n);
     System.out.println(coeficint);
    }

    
}
