import java.util.Scanner;
    public static void main(String args[]){

    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int num =sc.nextInt();
         for(int i=1;i<=num;i++)
         {
            if(num%10==0)
            {
              break;
            }
            System.out.println(num);
         }
         sc.close();
    }
    
}
